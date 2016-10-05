package frontend;

/**
 * Parser
 *
 * A language-independent framework class. This abstract class
 * will be implemented by language-specific subclasses.
 */
public abstract class Parser {
    protected Scanner scanner;
    // protected

    /**
     * Constructor
     *
     * @param scanner the scanner to be used with the parser
     */
    protected Parser(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Parse a source program and generate the intermediate code
     * and the symbol table. To be implemented by a language-specific
     * parser subclass.
     *
     * @throws Exception if and error ocurred
     */
    public abstract void parse() throws Exception;

    /**
     * Return the number of syntax errors found by the parser.
     * To be implemented by a language-specific parser subclass.
     *
     * @return the error count
     */
    public abstract int getErrorCount();

    /**
     * Call the scanners's currentToken() method
     * @return the current Token
     */
    public Token currentToken()
    {
        return null; // scanner.currentToken();
    }

    /**
     * Call the scanner's nextToken() method
     * @return the next Token
     */
    public Token nextToken()
    {
        return null; //scanner.nextToken();
    }
}
