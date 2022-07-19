/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.javampire.openscad.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.javampire.openscad.psi.OpenSCADTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>openscad.flex</tt>
 */
class OpenSCADLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INCLUDE_PATH = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\1\1\5\1\3\22\0\1\4\1\55\1\34\1\54\1\26\1\43\1\56\1\0\1\46"+
    "\1\47\1\11\1\32\1\41\1\42\1\30\1\10\12\27\1\45\1\40\1\6\1\25\1\7\1\44\1\0"+
    "\4\26\1\31\25\26\1\52\1\33\1\53\1\0\1\26\1\0\1\35\1\26\1\22\1\14\1\17\1\20"+
    "\2\26\1\24\2\26\1\16\1\12\1\21\1\13\2\26\1\37\1\36\1\23\1\15\5\26\1\50\1\57"+
    "\1\51\7\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\1\3\0\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\10\1\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\2\2\1\3\1\6\1\33"+
    "\1\3\1\34\1\35\4\0\1\36\1\37\1\40\1\41"+
    "\11\1\1\42\1\1\1\43\1\1\1\11\1\0\1\14"+
    "\1\44\1\45\1\46\1\0\1\40\5\0\1\41\1\47"+
    "\3\1\1\50\1\1\1\51\4\1\1\11\3\0\1\40"+
    "\12\0\2\47\2\1\1\0\1\52\1\53\2\1\1\54"+
    "\1\1\1\11\1\0\3\40\1\55\4\0\1\55\2\0"+
    "\1\41\1\0\1\1\1\56\1\1\1\57\1\1\3\0"+
    "\1\55\3\40\4\0\1\60\2\1\3\0\2\40\3\0"+
    "\2\1\2\0\2\40\3\0\1\61\1\0\1\62\2\0"+
    "\2\40\4\0\1\55\1\40\1\55\1\0\1\55\1\0"+
    "\1\40\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[189];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\360\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\360\0\u03f0"+
    "\0\360\0\360\0\360\0\360\0\360\0\360\0\360\0\360"+
    "\0\360\0\360\0\360\0\360\0\360\0\u0420\0\u0450\0\u0480"+
    "\0\u04b0\0\u04e0\0\u0510\0\u0540\0\360\0\360\0\u0570\0\u05a0"+
    "\0\u05d0\0\u0600\0\360\0\360\0\u0630\0\u0660\0\u0690\0\u06c0"+
    "\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0210"+
    "\0\u0840\0\360\0\u0870\0\u08a0\0\u08d0\0\360\0\360\0\360"+
    "\0\360\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\u0600\0\u09f0"+
    "\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0210\0\u0b10\0\u0210"+
    "\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\360\0\u0de0"+
    "\0\u0e10\0\u0e10\0\u0e40\0\u0e70\0\360\0\u0ea0\0\u0ed0\0\u0f00"+
    "\0\360\0\u0210\0\u0f30\0\u0f60\0\u0210\0\u0f90\0\u0c30\0\u0fc0"+
    "\0\u0ff0\0\u1020\0\u1050\0\u0930\0\u1080\0\u10b0\0\u10e0\0\u1110"+
    "\0\360\0\u1140\0\u1170\0\360\0\u11a0\0\u11d0\0\u0210\0\u1200"+
    "\0\u0210\0\u1230\0\u1260\0\u1290\0\u12c0\0\u0c90\0\u12f0\0\u1320"+
    "\0\u1350\0\u1380\0\u13b0\0\u13e0\0\u1410\0\u0210\0\u1440\0\u1470"+
    "\0\u14a0\0\u14d0\0\u1500\0\u1530\0\u1560\0\u1590\0\u15c0\0\u15f0"+
    "\0\u1620\0\u1650\0\u1680\0\u16b0\0\u16e0\0\u1710\0\u1740\0\u1770"+
    "\0\u17a0\0\u0210\0\u17d0\0\360\0\u1800\0\u1830\0\u1860\0\u1890"+
    "\0\u18c0\0\u18f0\0\u1920\0\u1950\0\u1020\0\u1980\0\u10e0\0\u19b0"+
    "\0\u1290\0\u19e0\0\u1a10\0\u1a40\0\u1a70";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[189];
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
    "\1\6\5\7\1\10\1\11\1\12\1\13\1\14\2\15"+
    "\1\16\1\17\1\20\1\21\2\15\1\22\1\23\1\24"+
    "\1\15\1\25\1\26\1\15\1\27\1\6\1\30\3\15"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\6\3\7\2\51\1\10\1\11\1\52\1\13\1\14"+
    "\2\15\1\16\1\17\1\20\1\21\2\15\1\22\1\23"+
    "\1\24\1\15\1\25\1\26\1\15\1\27\1\6\1\30"+
    "\3\15\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\53\5\54\1\55\1\56\50\53\4\0\2\4"+
    "\2\0\1\57\66\0\1\60\1\0\1\61\3\0\1\62"+
    "\113\0\5\7\77\0\1\63\57\0\1\64\42\0\1\65"+
    "\1\66\60\0\1\15\1\67\11\15\1\0\2\15\1\0"+
    "\1\15\3\0\3\15\32\0\13\15\1\0\2\15\1\0"+
    "\1\15\3\0\3\15\32\0\7\15\1\70\3\15\1\0"+
    "\2\15\1\0\1\15\3\0\1\15\1\71\1\15\32\0"+
    "\5\15\1\72\5\15\1\0\2\15\1\0\1\15\3\0"+
    "\3\15\32\0\4\15\1\73\6\15\1\0\2\15\1\0"+
    "\1\15\3\0\3\15\32\0\1\15\1\74\1\15\1\75"+
    "\7\15\1\0\2\15\1\0\1\15\3\0\1\76\2\15"+
    "\32\0\13\15\1\0\2\15\1\0\1\15\3\0\2\15"+
    "\1\77\32\0\6\15\1\100\1\101\3\15\1\0\2\15"+
    "\1\0\1\15\3\0\3\15\45\0\1\102\44\0\5\15"+
    "\1\103\5\15\1\0\1\15\1\25\1\104\1\103\3\0"+
    "\3\15\47\0\1\104\30\0\33\30\1\105\1\106\23\30"+
    "\25\0\1\107\110\0\1\110\60\0\1\111\1\0\3\7"+
    "\2\51\2\0\1\112\57\0\1\113\1\66\46\0\6\53"+
    "\2\0\51\53\5\54\2\0\50\53\10\0\1\114\65\0"+
    "\1\115\54\0\1\116\45\0\3\117\1\62\1\117\4\0"+
    "\13\120\1\0\2\120\1\0\1\120\3\0\3\120\20\0"+
    "\2\65\2\0\54\65\11\121\1\122\46\121\12\0\2\15"+
    "\1\123\10\15\1\0\2\15\1\0\1\15\3\0\3\15"+
    "\32\0\2\15\1\124\10\15\1\0\2\15\1\0\1\15"+
    "\3\0\3\15\32\0\5\15\1\125\5\15\1\0\2\15"+
    "\1\0\1\15\3\0\3\15\32\0\11\15\1\126\1\15"+
    "\1\0\2\15\1\0\1\15\3\0\3\15\32\0\13\15"+
    "\1\0\2\15\1\0\1\15\3\0\1\15\1\127\1\15"+
    "\32\0\13\15\1\0\2\15\1\0\1\15\3\0\2\15"+
    "\1\130\32\0\7\15\1\131\3\15\1\0\2\15\1\0"+
    "\1\15\3\0\3\15\32\0\4\15\1\132\6\15\1\0"+
    "\2\15\1\0\1\15\3\0\3\15\32\0\3\15\1\133"+
    "\7\15\1\0\2\15\1\0\1\15\3\0\3\15\32\0"+
    "\10\15\1\134\2\15\1\0\2\15\1\0\1\15\3\0"+
    "\3\15\32\0\13\15\1\0\1\15\1\135\1\0\1\15"+
    "\1\136\2\0\3\15\2\0\1\136\34\0\1\137\7\0"+
    "\1\104\1\0\1\137\26\0\60\30\10\0\1\140\47\0"+
    "\1\113\1\141\1\142\1\143\1\113\1\141\52\113\2\114"+
    "\1\4\1\144\54\114\15\0\1\145\66\0\1\146\34\0"+
    "\1\147\1\150\1\147\1\151\1\152\4\0\13\120\1\0"+
    "\2\120\1\0\1\120\3\0\3\120\20\0\11\121\1\153"+
    "\46\121\10\154\1\155\1\122\46\154\12\0\3\15\1\156"+
    "\7\15\1\0\2\15\1\0\1\15\3\0\3\15\32\0"+
    "\5\15\1\157\5\15\1\0\2\15\1\0\1\15\3\0"+
    "\3\15\21\0\5\160\1\161\3\0\13\15\1\0\2\15"+
    "\1\0\1\15\3\0\3\15\32\0\5\15\1\162\5\15"+
    "\1\0\2\15\1\0\1\15\3\0\3\15\32\0\10\15"+
    "\1\163\2\15\1\0\2\15\1\0\1\15\3\0\3\15"+
    "\32\0\13\15\1\0\2\15\1\0\1\15\3\0\1\15"+
    "\1\164\1\15\32\0\5\15\1\165\5\15\1\0\2\15"+
    "\1\0\1\15\3\0\3\15\32\0\4\15\1\166\6\15"+
    "\1\0\2\15\1\0\1\15\3\0\3\15\32\0\13\15"+
    "\1\0\1\15\1\135\1\0\1\15\3\0\3\15\47\0"+
    "\1\167\57\0\1\167\2\0\1\136\7\0\1\136\15\0"+
    "\1\140\1\170\1\142\1\143\1\140\1\170\52\140\1\113"+
    "\1\141\1\142\1\143\2\141\4\113\1\171\5\172\1\173"+
    "\4\172\1\174\2\172\1\113\1\172\3\113\3\172\20\113"+
    "\1\0\3\175\2\142\2\0\1\112\1\0\1\176\5\177"+
    "\1\200\4\177\1\201\2\177\1\0\1\177\3\0\3\177"+
    "\21\0\1\175\1\142\1\175\2\142\2\0\1\112\1\0"+
    "\1\176\5\177\1\200\4\177\1\201\2\177\1\0\1\177"+
    "\3\0\3\177\22\0\1\4\1\0\2\4\2\0\1\57"+
    "\63\0\1\202\66\0\1\203\37\0\1\147\55\0\1\147"+
    "\1\150\1\147\1\151\1\152\52\0\10\121\1\204\1\153"+
    "\46\121\11\154\1\205\46\154\12\0\4\15\1\206\6\15"+
    "\1\0\2\15\1\0\1\15\3\0\3\15\32\0\6\15"+
    "\1\207\4\15\1\0\2\15\1\0\1\15\3\0\3\15"+
    "\21\0\5\160\1\161\63\0\11\15\1\210\1\15\1\0"+
    "\2\15\1\0\1\15\3\0\3\15\32\0\5\15\1\211"+
    "\5\15\1\0\2\15\1\0\1\15\3\0\3\15\32\0"+
    "\3\15\1\212\7\15\1\0\2\15\1\0\1\15\3\0"+
    "\3\15\20\0\1\140\1\170\1\142\1\143\2\170\4\140"+
    "\1\213\5\214\1\215\4\214\1\216\2\214\1\140\1\214"+
    "\3\140\3\214\20\140\1\113\1\141\1\142\1\143\1\217"+
    "\1\141\4\113\1\172\1\220\11\172\1\174\2\172\1\113"+
    "\1\172\3\113\3\172\21\113\1\141\1\142\1\143\1\217"+
    "\1\141\4\113\13\172\1\174\2\172\1\113\1\172\3\113"+
    "\3\172\21\113\1\141\1\142\1\143\1\217\1\141\4\113"+
    "\3\172\1\221\7\172\1\174\2\172\1\113\1\172\3\113"+
    "\3\172\20\113\1\0\5\175\17\0\1\201\33\0\5\175"+
    "\4\0\1\177\1\222\11\177\1\201\2\177\1\0\1\177"+
    "\3\0\3\177\21\0\5\175\4\0\13\177\1\201\2\177"+
    "\1\0\1\177\3\0\3\177\21\0\5\175\4\0\3\177"+
    "\1\223\7\177\1\201\2\177\1\0\1\177\3\0\3\177"+
    "\33\0\1\224\66\0\1\225\35\0\10\154\1\155\1\205"+
    "\46\154\12\0\5\15\1\226\5\15\1\0\2\15\1\0"+
    "\1\15\3\0\3\15\32\0\12\15\1\227\1\0\2\15"+
    "\1\0\1\15\3\0\3\15\32\0\2\15\1\230\10\15"+
    "\1\0\2\15\1\0\1\15\3\0\3\15\20\0\1\140"+
    "\1\170\1\142\1\143\1\231\1\170\4\140\1\214\1\232"+
    "\11\214\1\216\2\214\1\140\1\214\3\140\3\214\21\140"+
    "\1\170\1\142\1\143\1\231\1\170\4\140\13\214\1\216"+
    "\2\214\1\140\1\214\3\140\3\214\21\140\1\170\1\142"+
    "\1\143\1\231\1\170\4\140\3\214\1\233\7\214\1\216"+
    "\2\214\1\140\1\214\3\140\3\214\20\140\1\113\1\141"+
    "\1\142\1\143\1\217\1\141\17\113\1\174\33\113\1\141"+
    "\1\142\1\143\1\217\1\141\4\113\2\172\1\234\10\172"+
    "\1\174\2\172\1\113\1\172\3\113\3\172\21\113\1\141"+
    "\1\142\1\143\1\217\1\141\4\113\7\172\1\235\3\172"+
    "\1\174\2\172\1\113\1\172\3\113\3\172\20\113\1\0"+
    "\5\175\4\0\2\177\1\236\10\177\1\201\2\177\1\0"+
    "\1\177\3\0\3\177\21\0\5\175\4\0\7\177\1\237"+
    "\3\177\1\201\2\177\1\0\1\177\3\0\3\177\32\0"+
    "\1\151\66\0\1\240\50\0\1\15\1\241\11\15\1\0"+
    "\2\15\1\0\1\15\3\0\3\15\32\0\5\15\1\242"+
    "\5\15\1\0\2\15\1\0\1\15\3\0\3\15\20\0"+
    "\1\140\1\170\1\142\1\143\1\231\1\170\17\140\1\216"+
    "\33\140\1\170\1\142\1\143\1\231\1\170\4\140\2\214"+
    "\1\243\10\214\1\216\2\214\1\140\1\214\3\140\3\214"+
    "\21\140\1\170\1\142\1\143\1\231\1\170\4\140\7\214"+
    "\1\244\3\214\1\216\2\214\1\140\1\214\3\140\3\214"+
    "\20\140\1\113\1\141\1\142\1\143\1\217\1\141\4\113"+
    "\3\172\1\245\7\172\1\174\2\172\1\113\1\172\3\113"+
    "\3\172\21\113\1\141\1\142\1\143\1\217\1\141\4\113"+
    "\10\172\1\246\2\172\1\174\2\172\1\113\1\172\3\113"+
    "\3\172\20\113\1\0\5\175\4\0\3\177\1\247\7\177"+
    "\1\201\2\177\1\0\1\177\3\0\3\177\21\0\5\175"+
    "\4\0\10\177\1\250\2\177\1\201\2\177\1\0\1\177"+
    "\3\0\3\177\35\0\1\251\54\0\7\15\1\252\3\15"+
    "\1\0\2\15\1\0\1\15\3\0\3\15\21\0\5\253"+
    "\1\254\3\0\13\15\1\0\2\15\1\0\1\15\3\0"+
    "\3\15\20\0\1\140\1\170\1\142\1\143\1\231\1\170"+
    "\4\140\3\214\1\255\7\214\1\216\2\214\1\140\1\214"+
    "\3\140\3\214\21\140\1\170\1\142\1\143\1\231\1\170"+
    "\4\140\10\214\1\256\2\214\1\216\2\214\1\140\1\214"+
    "\3\140\3\214\20\140\1\113\1\141\1\142\1\143\1\217"+
    "\1\141\4\113\4\172\1\257\6\172\1\174\2\172\1\113"+
    "\1\172\3\113\3\172\21\113\1\141\1\142\1\143\1\217"+
    "\1\141\4\113\11\172\1\260\1\172\1\174\2\172\1\113"+
    "\1\172\3\113\3\172\20\113\1\0\5\175\4\0\4\177"+
    "\1\261\6\177\1\201\2\177\1\0\1\177\3\0\3\177"+
    "\21\0\5\175\4\0\11\177\1\262\1\177\1\201\2\177"+
    "\1\0\1\177\3\0\3\177\40\0\1\151\40\0\5\253"+
    "\1\254\51\0\1\140\1\170\1\142\1\143\1\231\1\170"+
    "\4\140\4\214\1\263\6\214\1\216\2\214\1\140\1\214"+
    "\3\140\3\214\21\140\1\170\1\142\1\143\1\231\1\170"+
    "\4\140\11\214\1\264\1\214\1\216\2\214\1\140\1\214"+
    "\3\140\3\214\20\140\1\113\1\141\1\142\1\143\1\217"+
    "\1\141\4\113\5\172\1\265\5\172\1\174\2\172\1\113"+
    "\1\172\3\113\3\172\21\113\1\141\1\142\1\143\1\217"+
    "\1\141\4\113\12\172\1\266\1\174\2\172\1\113\1\172"+
    "\3\113\3\172\20\113\1\0\5\175\4\0\5\177\1\267"+
    "\5\177\1\201\2\177\1\0\1\177\3\0\3\177\21\0"+
    "\5\175\4\0\12\177\1\270\1\201\2\177\1\0\1\177"+
    "\3\0\3\177\20\0\1\140\1\170\1\142\1\143\1\231"+
    "\1\170\4\140\5\214\1\271\5\214\1\216\2\214\1\140"+
    "\1\214\3\140\3\214\21\140\1\170\1\142\1\143\1\231"+
    "\1\170\4\140\12\214\1\272\1\216\2\214\1\140\1\214"+
    "\3\140\3\214\20\140\1\113\1\141\1\142\1\143\1\217"+
    "\1\141\4\113\1\172\1\273\11\172\1\174\2\172\1\113"+
    "\1\172\3\113\3\172\20\113\1\0\5\175\4\0\1\177"+
    "\1\274\11\177\1\201\2\177\1\0\1\177\3\0\3\177"+
    "\20\0\1\140\1\170\1\142\1\143\1\231\1\170\4\140"+
    "\1\214\1\275\11\214\1\216\2\214\1\140\1\214\3\140"+
    "\3\214\20\140\1\113\1\141\1\142\1\143\1\217\1\141"+
    "\4\113\7\172\1\265\3\172\1\174\2\172\1\113\1\172"+
    "\3\113\3\172\20\113\1\0\5\175\4\0\7\177\1\267"+
    "\3\177\1\201\2\177\1\0\1\177\3\0\3\177\20\0"+
    "\1\140\1\170\1\142\1\143\1\231\1\170\4\140\7\214"+
    "\1\271\3\214\1\216\2\214\1\140\1\214\3\140\3\214"+
    "\20\140";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6816];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\1\3\0\1\11\4\1\1\11\13\1\1\11\1\1"+
    "\15\11\7\1\2\11\4\0\2\11\15\1\1\11\2\1"+
    "\1\0\4\11\1\0\2\1\2\0\1\1\1\0\15\1"+
    "\3\0\1\1\5\0\1\11\1\1\1\0\1\1\1\0"+
    "\1\1\1\11\2\1\1\0\1\11\6\1\1\0\4\1"+
    "\4\0\1\11\2\0\1\11\1\0\5\1\3\0\4\1"+
    "\4\0\3\1\3\0\2\1\3\0\2\1\2\0\2\1"+
    "\3\0\1\1\1\0\1\11\2\0\2\1\4\0\3\1"+
    "\1\0\1\1\1\0\1\1\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[189];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /** For the backwards DFA of general lookahead statements */
  private boolean [] zzFin = new boolean [ZZ_BUFFERSIZE+1];


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  OpenSCADLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':  // fall through
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return OpenSCADTypes.IDENTIFIER;
            } 
            // fall through
          case 51: break;
          case 2: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 52: break;
          case 3: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 53: break;
          case 4: 
            { return OpenSCADTypes.LT;
            } 
            // fall through
          case 54: break;
          case 5: 
            { return OpenSCADTypes.GT;
            } 
            // fall through
          case 55: break;
          case 6: 
            { return OpenSCADTypes.DIV;
            } 
            // fall through
          case 56: break;
          case 7: 
            { return OpenSCADTypes.MUL;
            } 
            // fall through
          case 57: break;
          case 8: 
            { return OpenSCADTypes.EQUALS;
            } 
            // fall through
          case 58: break;
          case 9: 
            { return OpenSCADTypes.NUMBER_LITERAL;
            } 
            // fall through
          case 59: break;
          case 10: 
            { return OpenSCADTypes.DOT;
            } 
            // fall through
          case 60: break;
          case 11: 
            { return OpenSCADTypes.PLUS;
            } 
            // fall through
          case 61: break;
          case 12: 
            { return OpenSCADTypes.STRING_LITERAL;
            } 
            // fall through
          case 62: break;
          case 13: 
            { return OpenSCADTypes.SEMICOLON;
            } 
            // fall through
          case 63: break;
          case 14: 
            { return OpenSCADTypes.COMMA;
            } 
            // fall through
          case 64: break;
          case 15: 
            { return OpenSCADTypes.MINUS;
            } 
            // fall through
          case 65: break;
          case 16: 
            { return OpenSCADTypes.PERC;
            } 
            // fall through
          case 66: break;
          case 17: 
            { return OpenSCADTypes.QUERY;
            } 
            // fall through
          case 67: break;
          case 18: 
            { return OpenSCADTypes.COLON;
            } 
            // fall through
          case 68: break;
          case 19: 
            { return OpenSCADTypes.LPARENTH;
            } 
            // fall through
          case 69: break;
          case 20: 
            { return OpenSCADTypes.RPARENTH;
            } 
            // fall through
          case 70: break;
          case 21: 
            { return OpenSCADTypes.LBRACE;
            } 
            // fall through
          case 71: break;
          case 22: 
            { return OpenSCADTypes.RBRACE;
            } 
            // fall through
          case 72: break;
          case 23: 
            { return OpenSCADTypes.LBRACKET;
            } 
            // fall through
          case 73: break;
          case 24: 
            { return OpenSCADTypes.RBRACKET;
            } 
            // fall through
          case 74: break;
          case 25: 
            { return OpenSCADTypes.HASH;
            } 
            // fall through
          case 75: break;
          case 26: 
            { return OpenSCADTypes.EXCL;
            } 
            // fall through
          case 76: break;
          case 27: 
            { return OpenSCADTypes.INCLUDE_PATH;
            } 
            // fall through
          case 77: break;
          case 28: 
            { return OpenSCADTypes.INCLUDE_START;
            } 
            // fall through
          case 78: break;
          case 29: 
            { yybegin(YYINITIAL); return OpenSCADTypes.INCLUDE_END;
            } 
            // fall through
          case 79: break;
          case 30: 
            { return OpenSCADTypes.LE;
            } 
            // fall through
          case 80: break;
          case 31: 
            { return OpenSCADTypes.GE;
            } 
            // fall through
          case 81: break;
          case 32: 
            { return OpenSCADTypes.END_OF_LINE_COMMENT;
            } 
            // fall through
          case 82: break;
          case 33: 
            { return OpenSCADTypes.C_STYLE_COMMENT;
            } 
            // fall through
          case 83: break;
          case 34: 
            { return OpenSCADTypes.IF_KEYWORD;
            } 
            // fall through
          case 84: break;
          case 35: 
            { return OpenSCADTypes.EQ;
            } 
            // fall through
          case 85: break;
          case 36: 
            { return OpenSCADTypes.NE;
            } 
            // fall through
          case 86: break;
          case 37: 
            { return OpenSCADTypes.AND;
            } 
            // fall through
          case 87: break;
          case 38: 
            { return OpenSCADTypes.OR;
            } 
            // fall through
          case 88: break;
          case 39: 
            { return OpenSCADTypes.DOC_COMMENT;
            } 
            // fall through
          case 89: break;
          case 40: 
            { return OpenSCADTypes.LET_KEYWORD;
            } 
            // fall through
          case 90: break;
          case 41: 
            { return OpenSCADTypes.FOR_KEYWORD;
            } 
            // fall through
          case 91: break;
          case 42: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 3);
            { yybegin(INCLUDE_PATH); return OpenSCADTypes.USE_KEYWORD;
            } 
            // fall through
          case 92: break;
          case 43: 
            { return OpenSCADTypes.ELSE_KEYWORD;
            } 
            // fall through
          case 93: break;
          case 44: 
            { return OpenSCADTypes.TRUE_KEYWORD;
            } 
            // fall through
          case 94: break;
          case 45: 
            // general lookahead, find correct zzMarkedPos
            { int zzFState = 3;
              int zzFPos = zzStartRead;
              if (zzFin.length <= zzBufferL.length()) { zzFin = new boolean[zzBufferL.length()+1]; }
              boolean zzFinL[] = zzFin;
              while (zzFState != -1 && zzFPos < zzMarkedPos) {
                zzFinL[zzFPos] = ((zzAttrL[zzFState] & 1) == 1);
                zzInput = Character.codePointAt(zzBufferL, zzFPos/*, zzMarkedPos*/);
                zzFPos += Character.charCount(zzInput);
                zzFState = zzTransL[ zzRowMapL[zzFState] + ZZ_CMAP(zzInput) ];
              }
              if (zzFState != -1) { zzFinL[zzFPos++] = ((zzAttrL[zzFState] & 1) == 1); } 
              while (zzFPos <= zzMarkedPos) {
                zzFinL[zzFPos++] = false;
              }

              zzFState = 4;
              zzFPos = zzMarkedPos;
              while (!zzFinL[zzFPos] || (zzAttrL[zzFState] & 1) != 1) {
                zzInput = Character.codePointBefore(zzBufferL, zzFPos/*, zzStartRead*/);
                zzFPos -= Character.charCount(zzInput);
                zzFState = zzTransL[ zzRowMapL[zzFState] + ZZ_CMAP(zzInput) ];
              };
              zzMarkedPos = zzFPos;
            }
            { return OpenSCADTypes.BLOCK_COMMENT;
            } 
            // fall through
          case 95: break;
          case 46: 
            { return OpenSCADTypes.UNDEF_KEYWORD;
            } 
            // fall through
          case 96: break;
          case 47: 
            { return OpenSCADTypes.FALSE_KEYWORD;
            } 
            // fall through
          case 97: break;
          case 48: 
            { return OpenSCADTypes.MODULE_KEYWORD;
            } 
            // fall through
          case 98: break;
          case 49: 
            { return OpenSCADTypes.FUNCTION_KEYWORD;
            } 
            // fall through
          case 99: break;
          case 50: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 7);
            { yybegin(INCLUDE_PATH); return OpenSCADTypes.INCLUDE_KEYWORD;
            } 
            // fall through
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
