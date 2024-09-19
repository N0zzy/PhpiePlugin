// This is a generated file. Not intended for manual editing.
package com.n0zzy.phpie.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.n0zzy.sdk.language.psi.PhpieTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;
import com.n0zzy.sdk.language.psi.PhpieTypes;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PhpieParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return phpieFile(b, l + 1);
  }

  /* ********************************************************** */
  // AS_KEYWORD
  static boolean as_keyword(PsiBuilder b, int l) {
    return consumeToken(b, PhpieTypes.AS_KEYWORD);
  }

  /* ********************************************************** */
  // ws+ as_keyword ws+ IDENTIFIER ws*
  public static boolean as_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_statement")) return false;
    if (!nextTokenIs(b, PhpieTypes.WHITE_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = as_statement_0(b, l + 1);
    r = r && as_keyword(b, l + 1);
    r = r && as_statement_2(b, l + 1);
    r = r && consumeToken(b, PhpieTypes.IDENTIFIER);
    r = r && as_statement_4(b, l + 1);
    exit_section_(b, m, PhpieTypes.AS_STATEMENT, r);
    return r;
  }

  // ws+
  private static boolean as_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "as_statement_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ws+
  private static boolean as_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "as_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ws*
  private static boolean as_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_statement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "as_statement_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // namespace_init ws* LBRACE ws* use_statement* ws* RBRACE ws*
  static boolean namespace_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_block")) return false;
    if (!nextTokenIs(b, PhpieTypes.NAMESPACE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_init(b, l + 1);
    r = r && namespace_block_1(b, l + 1);
    r = r && consumeToken(b, PhpieTypes.LBRACE);
    r = r && namespace_block_3(b, l + 1);
    r = r && namespace_block_4(b, l + 1);
    r = r && namespace_block_5(b, l + 1);
    r = r && consumeToken(b, PhpieTypes.RBRACE);
    r = r && namespace_block_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws*
  private static boolean namespace_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_block_1", c)) break;
    }
    return true;
  }

  // ws*
  private static boolean namespace_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_block_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_block_3", c)) break;
    }
    return true;
  }

  // use_statement*
  private static boolean namespace_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_block_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_block_4", c)) break;
    }
    return true;
  }

  // ws*
  private static boolean namespace_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_block_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_block_5", c)) break;
    }
    return true;
  }

  // ws*
  private static boolean namespace_block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_block_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_block_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // namespace_keyword ws+ IDENTIFIER (BACKSLASH IDENTIFIER)*
  static boolean namespace_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_init")) return false;
    if (!nextTokenIs(b, PhpieTypes.NAMESPACE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_keyword(b, l + 1);
    r = r && namespace_init_1(b, l + 1);
    r = r && consumeToken(b, PhpieTypes.IDENTIFIER);
    r = r && namespace_init_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws+
  private static boolean namespace_init_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_init_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_init_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (BACKSLASH IDENTIFIER)*
  private static boolean namespace_init_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_init_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namespace_init_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_init_3", c)) break;
    }
    return true;
  }

  // BACKSLASH IDENTIFIER
  private static boolean namespace_init_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_init_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PhpieTypes.BACKSLASH, PhpieTypes.IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAMESPACE_KEYWORD
  static boolean namespace_keyword(PsiBuilder b, int l) {
    return consumeToken(b, PhpieTypes.NAMESPACE_KEYWORD);
  }

  /* ********************************************************** */
  // namespace_init ws* SEMICOLON ws*
  static boolean namespace_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_line")) return false;
    if (!nextTokenIs(b, PhpieTypes.NAMESPACE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_init(b, l + 1);
    r = r && namespace_line_1(b, l + 1);
    r = r && consumeToken(b, PhpieTypes.SEMICOLON);
    r = r && namespace_line_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws*
  private static boolean namespace_line_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_line_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_line_1", c)) break;
    }
    return true;
  }

  // ws*
  private static boolean namespace_line_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_line_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_line_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // use_statement* namespace_line use_statement* | namespace_block+
  public static boolean namespace_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_statement")) return false;
    if (!nextTokenIs(b, "<namespace statement>", PhpieTypes.NAMESPACE_KEYWORD, PhpieTypes.USE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PhpieTypes.NAMESPACE_STATEMENT, "<namespace statement>");
    r = namespace_statement_0(b, l + 1);
    if (!r) r = namespace_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // use_statement* namespace_line use_statement*
  private static boolean namespace_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_statement_0_0(b, l + 1);
    r = r && namespace_line(b, l + 1);
    r = r && namespace_statement_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // use_statement*
  private static boolean namespace_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_statement_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_statement_0_0", c)) break;
    }
    return true;
  }

  // use_statement*
  private static boolean namespace_statement_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_statement_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_statement_0_2", c)) break;
    }
    return true;
  }

  // namespace_block+
  private static boolean namespace_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_block(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!namespace_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tag_open_statement
  //     namespace_statement
  static boolean phpieFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpieFile")) return false;
    if (!nextTokenIs(b, PhpieTypes.TAG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag_open_statement(b, l + 1);
    r = r && namespace_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TAG_OPEN
  static boolean tag_open(PsiBuilder b, int l) {
    return consumeToken(b, PhpieTypes.TAG_OPEN);
  }

  /* ********************************************************** */
  // tag_open ws*
  public static boolean tag_open_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_open_statement")) return false;
    if (!nextTokenIs(b, PhpieTypes.TAG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag_open(b, l + 1);
    r = r && tag_open_statement_1(b, l + 1);
    exit_section_(b, m, PhpieTypes.TAG_OPEN_STATEMENT, r);
    return r;
  }

  // ws*
  private static boolean tag_open_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_open_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tag_open_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // USE_KEYWORD
  static boolean use_keyword(PsiBuilder b, int l) {
    return consumeToken(b, PhpieTypes.USE_KEYWORD);
  }

  /* ********************************************************** */
  // use_keyword ws+ IDENTIFIER (BACKSLASH IDENTIFIER)* as_statement? ws* SEMICOLON ws*
  public static boolean use_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement")) return false;
    if (!nextTokenIs(b, PhpieTypes.USE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_keyword(b, l + 1);
    r = r && use_statement_1(b, l + 1);
    r = r && consumeToken(b, PhpieTypes.IDENTIFIER);
    r = r && use_statement_3(b, l + 1);
    r = r && use_statement_4(b, l + 1);
    r = r && use_statement_5(b, l + 1);
    r = r && consumeToken(b, PhpieTypes.SEMICOLON);
    r = r && use_statement_7(b, l + 1);
    exit_section_(b, m, PhpieTypes.USE_STATEMENT, r);
    return r;
  }

  // ws+
  private static boolean use_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (BACKSLASH IDENTIFIER)*
  private static boolean use_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_statement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_statement_3", c)) break;
    }
    return true;
  }

  // BACKSLASH IDENTIFIER
  private static boolean use_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PhpieTypes.BACKSLASH, PhpieTypes.IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // as_statement?
  private static boolean use_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_4")) return false;
    as_statement(b, l + 1);
    return true;
  }

  // ws*
  private static boolean use_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_statement_5", c)) break;
    }
    return true;
  }

  // ws*
  private static boolean use_statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ws(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_statement_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // WHITE_SPACE
  static boolean ws(PsiBuilder b, int l) {
    return consumeToken(b, PhpieTypes.WHITE_SPACE);
  }

}
