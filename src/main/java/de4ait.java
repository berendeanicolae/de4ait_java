import frontend.lexer.Lexer;
import frontend.parser.Parser;
import intermediate.ICode;

import java.io.*;

/**
 * Created by nberendea on 10/31/2016.
 */
public class de4ait {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("Usage: de4ait name");
            System.exit(-1);
        }

        de4ait de4ait = new de4ait(args[0]);
        de4ait.run();
    }

    private final String source;

    de4ait(String source) {
        this.source = source;
    }

    private ICode parse() {
        Reader reader = null;
        try {
            reader = new FileReader(source);
            Parser parser = new Parser(new Lexer(reader));
            parser.parse();
            return parser.getRoot();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void run() {
        ICode ic = parse();
        // ic.getRoot();
    }
}
