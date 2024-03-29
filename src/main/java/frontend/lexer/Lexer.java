/* The following code was generated by JFlex 1.6.1 */

package frontend.lexer;

import java_cup.runtime.*;
import frontend.parser.sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/work/de4ait/src/main/java/frontend/lexer/Lexer.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\31\1\32\1\1\22\0\1\3\1\0\1\27"+
    "\1\33\1\47\1\0\1\41\1\0\1\51\1\52\1\37\1\34\1\50"+
    "\1\36\1\0\1\40\12\4\1\46\1\0\1\43\1\35\1\44\1\45"+
    "\1\26\1\21\1\5\1\20\1\16\1\12\1\7\1\5\1\11\1\6"+
    "\2\5\1\14\1\5\1\13\1\22\1\25\1\5\1\23\1\15\1\10"+
    "\2\5\1\17\1\24\2\5\1\53\1\30\1\54\1\42\1\5\1\0"+
    "\32\5\12\0\1\31\u1fa2\0\1\31\1\31\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\10\5\3\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\2\5\1\30\7\5\1\31\1\0\1\31\2\0"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\10\5\1\0\1\44\2\5\1\44\3\5"+
    "\1\45\1\46\1\47\1\50\4\5\1\51\2\5\1\52"+
    "\3\5\1\53\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\55\0\55\0\207\0\264\0\341"+
    "\0\u010e\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249"+
    "\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\55"+
    "\0\u03b1\0\u03de\0\55\0\55\0\55\0\55\0\55\0\55"+
    "\0\55\0\55\0\264\0\u040b\0\u0438\0\264\0\u0465\0\u0492"+
    "\0\u04bf\0\u04ec\0\u0519\0\u0546\0\u0573\0\u021c\0\u0249\0\55"+
    "\0\u05a0\0\u05cd\0\55\0\55\0\55\0\55\0\55\0\55"+
    "\0\55\0\55\0\55\0\264\0\u05fa\0\u0627\0\u0654\0\u0681"+
    "\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\264\0\u078f\0\u07bc"+
    "\0\u07e9\0\u0816\0\u0843\0\u0870\0\264\0\264\0\55\0\264"+
    "\0\u089d\0\u08ca\0\u08f7\0\u0924\0\264\0\u0951\0\u097e\0\264"+
    "\0\u09ab\0\u09d8\0\u0a05\0\264\0\264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\7\1\13\2\7\1\14\1\7\1\15\1\16"+
    "\5\7\1\17\1\20\1\2\1\0\1\5\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\57\0\1\4\56\0\1\6\54\0\22\7\33\0\3\7"+
    "\1\43\16\7\33\0\16\7\1\44\3\7\33\0\5\7"+
    "\1\45\10\7\1\46\3\7\33\0\7\7\1\47\1\50"+
    "\7\7\1\51\1\7\33\0\13\7\1\52\6\7\33\0"+
    "\5\7\1\53\1\54\13\7\33\0\15\7\1\55\4\7"+
    "\34\0\21\56\27\0\27\57\1\60\1\61\24\57\1\62"+
    "\2\0\26\62\2\0\22\62\35\0\1\63\54\0\1\64"+
    "\54\0\1\65\54\0\1\66\54\0\1\67\54\0\1\70"+
    "\54\0\1\71\6\0\1\72\45\0\1\73\23\0\17\7"+
    "\1\74\2\7\33\0\6\7\1\75\13\7\33\0\12\7"+
    "\1\76\7\7\33\0\11\7\1\77\10\7\33\0\2\7"+
    "\1\100\17\7\33\0\2\7\1\101\17\7\33\0\2\7"+
    "\1\102\17\7\33\0\7\7\1\103\12\7\33\0\11\7"+
    "\1\104\10\7\27\0\1\57\2\0\26\57\2\0\22\57"+
    "\1\62\1\105\1\0\26\62\2\0\22\62\4\0\7\7"+
    "\1\106\12\7\33\0\2\7\1\107\6\7\1\110\10\7"+
    "\33\0\6\7\1\111\13\7\33\0\4\7\1\112\15\7"+
    "\33\0\4\7\1\113\15\7\33\0\10\7\1\114\11\7"+
    "\33\0\12\7\1\115\7\7\33\0\6\7\1\116\13\7"+
    "\31\0\1\117\56\0\3\7\1\120\16\7\33\0\13\7"+
    "\1\121\6\7\33\0\2\7\1\122\17\7\33\0\10\7"+
    "\1\123\11\7\33\0\14\7\1\124\5\7\33\0\6\7"+
    "\1\125\13\7\33\0\2\7\1\126\17\7\33\0\3\7"+
    "\1\106\16\7\33\0\16\7\1\127\3\7\33\0\5\7"+
    "\1\130\14\7\33\0\4\7\1\131\15\7\33\0\16\7"+
    "\1\132\3\7\33\0\14\7\1\133\5\7\33\0\21\7"+
    "\1\134\33\0\5\7\1\135\14\7\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2610];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\22\1\1\11\2\1\10\11"+
    "\14\1\1\0\1\11\2\0\11\11\11\1\1\0\11\1"+
    "\1\11\16\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* error */
            }
          case 45: break;
          case 2: 
            { return new Symbol(sym.SEP, yychar, yychar+yytext().length()-1);
            }
          case 46: break;
          case 3: 
            { /* ignore */
            }
          case 47: break;
          case 4: 
            { return new Symbol(sym.INT_LIT, yychar, yychar+yytext().length()-1);
            }
          case 48: break;
          case 5: 
            { return new Symbol(sym.IDENTIFIER, yychar, yychar+yytext().length()-1);
            }
          case 49: break;
          case 6: 
            { return new Symbol(sym.ADD_OP, yychar, yychar+yytext().length()-1);
            }
          case 50: break;
          case 7: 
            { return new Symbol(sym.EQ_OP, yychar, yychar+yytext().length()-1);
            }
          case 51: break;
          case 8: 
            { return new Symbol(sym.SUB_OP, yychar, yychar+yytext().length()-1);
            }
          case 52: break;
          case 9: 
            { return new Symbol(sym.MUL_OP, yychar, yychar+yytext().length()-1);
            }
          case 53: break;
          case 10: 
            { return new Symbol(sym.DIV_OP, yychar, yychar+yytext().length()-1);
            }
          case 54: break;
          case 11: 
            { return new Symbol(sym.AND_OP, yychar, yychar+yytext().length()-1);
            }
          case 55: break;
          case 12: 
            { return new Symbol(sym.POW_OP, yychar, yychar+yytext().length()-1);
            }
          case 56: break;
          case 13: 
            { return new Symbol(sym.LT_OP, yychar, yychar+yytext().length()-1);
            }
          case 57: break;
          case 14: 
            { return new Symbol(sym.GT_OP, yychar, yychar+yytext().length()-1);
            }
          case 58: break;
          case 15: 
            { return new Symbol(sym.COND, yychar, yychar+yytext().length()-1);
            }
          case 59: break;
          case 16: 
            { return new Symbol(sym.COLON, yychar, yychar+yytext().length()-1);
            }
          case 60: break;
          case 17: 
            { return new Symbol(sym.DOLLAR, yychar, yychar+yytext().length()-1);
            }
          case 61: break;
          case 18: 
            { return new Symbol(sym.COMMA, yychar, yychar+yytext().length()-1);
            }
          case 62: break;
          case 19: 
            { return new Symbol(sym.LPAREN, yychar, yychar+yytext().length()-1);
            }
          case 63: break;
          case 20: 
            { return new Symbol(sym.RPAREN, yychar, yychar+yytext().length()-1);
            }
          case 64: break;
          case 21: 
            { return new Symbol(sym.LBRAC, yychar, yychar+yytext().length()-1);
            }
          case 65: break;
          case 22: 
            { return new Symbol(sym.RBRAC, yychar, yychar+yytext().length()-1);
            }
          case 66: break;
          case 23: 
            { return new Symbol(sym.IF, yychar, yychar+yytext().length()-1);
            }
          case 67: break;
          case 24: 
            { return new Symbol(sym.TO, yychar, yychar+yytext().length()-1);
            }
          case 68: break;
          case 25: 
            { return new Symbol(sym.STRING_LIT, yychar, yychar+yytext().length()-1);
            }
          case 69: break;
          case 26: 
            { return new Symbol(sym.ADD_ASSIGN, yychar, yychar+yytext().length()-1);
            }
          case 70: break;
          case 27: 
            { return new Symbol(sym.EQEQ_OP, yychar, yychar+yytext().length()-1);
            }
          case 71: break;
          case 28: 
            { return new Symbol(sym.SUB_ASSIGN, yychar, yychar+yytext().length()-1);
            }
          case 72: break;
          case 29: 
            { return new Symbol(sym.MUL_ASSIGN, yychar, yychar+yytext().length()-1);
            }
          case 73: break;
          case 30: 
            { return new Symbol(sym.DIV_ASSIGN, yychar, yychar+yytext().length()-1);
            }
          case 74: break;
          case 31: 
            { return new Symbol(sym.AND_ASSIGN, yychar, yychar+yytext().length()-1);
            }
          case 75: break;
          case 32: 
            { return new Symbol(sym.LE_OP, yychar, yychar+yytext().length()-1);
            }
          case 76: break;
          case 33: 
            { return new Symbol(sym.NE_OP, yychar, yychar+yytext().length()-1);
            }
          case 77: break;
          case 34: 
            { return new Symbol(sym.GE_OP, yychar, yychar+yytext().length()-1);
            }
          case 78: break;
          case 35: 
            { return new Symbol(sym.FOR, yychar, yychar+yytext().length()-1);
            }
          case 79: break;
          case 36: 
            { return new Symbol(sym.THEN, yychar, yychar+yytext().length()-1);
            }
          case 80: break;
          case 37: 
            { return new Symbol(sym.WEND, yychar, yychar+yytext().length()-1);
            }
          case 81: break;
          case 38: 
            { return new Symbol(sym.CASE, yychar, yychar+yytext().length()-1);
            }
          case 82: break;
          case 39: 
            { 
            }
          case 83: break;
          case 40: 
            { return new Symbol(sym.ENDIF, yychar, yychar+yytext().length()-1);
            }
          case 84: break;
          case 41: 
            { return new Symbol(sym.WHILE, yychar, yychar+yytext().length()-1);
            }
          case 85: break;
          case 42: 
            { return new Symbol(sym.SWITCH, yychar, yychar+yytext().length()-1);
            }
          case 86: break;
          case 43: 
            { return new Symbol(sym.EXITLOOP, yychar, yychar+yytext().length()-1);
            }
          case 87: break;
          case 44: 
            { return new Symbol(sym.ENDSWITCH, yychar, yychar+yytext().length()-1);
            }
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
