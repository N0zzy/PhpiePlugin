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
    return phpFile(b, l + 1);
  }

  /* ********************************************************** */
  // M_ABSTRACT
  public static boolean abstract_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_modifier")) return false;
    if (!nextTokenIs(b, M_ABSTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_ABSTRACT);
    exit_section_(b, m, ABSTRACT_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // C_ARROW
  public static boolean arrow_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrow_char")) return false;
    if (!nextTokenIs(b, C_ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_ARROW);
    exit_section_(b, m, ARROW_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // A_AS
  public static boolean as_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_alias")) return false;
    if (!nextTokenIs(b, A_AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, A_AS);
    exit_section_(b, m, AS_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // C_BACKSLASH
  public static boolean backslash_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "backslash_char")) return false;
    if (!nextTokenIs(b, C_BACKSLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_BACKSLASH);
    exit_section_(b, m, BACKSLASH_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // E_BREAK
  public static boolean break_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_expr")) return false;
    if (!nextTokenIs(b, E_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_BREAK);
    exit_section_(b, m, BREAK_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // E_CASE
  public static boolean case_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_expr")) return false;
    if (!nextTokenIs(b, E_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_CASE);
    exit_section_(b, m, CASE_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // E_CATCH
  public static boolean catch_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_expr")) return false;
    if (!nextTokenIs(b, E_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_CATCH);
    exit_section_(b, m, CATCH_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // K_CLASS
  public static boolean class_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_keyword")) return false;
    if (!nextTokenIs(b, K_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CLASS);
    exit_section_(b, m, CLASS_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // T_CLOSE_TAG
  public static boolean close_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "close_tag")) return false;
    if (!nextTokenIs(b, T_CLOSE_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLOSE_TAG);
    exit_section_(b, m, CLOSE_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // C_COLON
  public static boolean colon_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon_char")) return false;
    if (!nextTokenIs(b, C_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_COLON);
    exit_section_(b, m, COLON_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // C_COMMA
  public static boolean comma_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_char")) return false;
    if (!nextTokenIs(b, C_COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_COMMA);
    exit_section_(b, m, COMMA_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // M_CONST
  public static boolean const_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_modifier")) return false;
    if (!nextTokenIs(b, M_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_CONST);
    exit_section_(b, m, CONST_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // E_CONTINUE
  public static boolean continue_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_expr")) return false;
    if (!nextTokenIs(b, E_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_CONTINUE);
    exit_section_(b, m, CONTINUE_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // C_DARROW
  public static boolean darrow_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "darrow_char")) return false;
    if (!nextTokenIs(b, C_DARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_DARROW);
    exit_section_(b, m, DARROW_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // C_DCOLON
  public static boolean dcolon_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dcolon_char")) return false;
    if (!nextTokenIs(b, C_DCOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_DCOLON);
    exit_section_(b, m, DCOLON_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // E_DEFAULT
  public static boolean default_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_expr")) return false;
    if (!nextTokenIs(b, E_DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_DEFAULT);
    exit_section_(b, m, DEFAULT_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // T_DIGIT
  public static boolean digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "digit")) return false;
    if (!nextTokenIs(b, T_DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DIGIT);
    exit_section_(b, m, DIGIT, r);
    return r;
  }

  /* ********************************************************** */
  // E_DO
  public static boolean do_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_expr")) return false;
    if (!nextTokenIs(b, E_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_DO);
    exit_section_(b, m, DO_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // E_ELSE
  public static boolean else_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_expr")) return false;
    if (!nextTokenIs(b, E_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_ELSE);
    exit_section_(b, m, ELSE_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // K_ENUM
  public static boolean enum_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_keyword")) return false;
    if (!nextTokenIs(b, K_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_ENUM);
    exit_section_(b, m, ENUM_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // A_EXTENDS
  public static boolean extends_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_alias")) return false;
    if (!nextTokenIs(b, A_EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, A_EXTENDS);
    exit_section_(b, m, EXTENDS_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // M_FINAL
  public static boolean final_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "final_modifier")) return false;
    if (!nextTokenIs(b, M_FINAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_FINAL);
    exit_section_(b, m, FINAL_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // E_FINALLY
  public static boolean finally_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finally_expr")) return false;
    if (!nextTokenIs(b, E_FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_FINALLY);
    exit_section_(b, m, FINALLY_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // E_FOR
  public static boolean for_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_expr")) return false;
    if (!nextTokenIs(b, E_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_FOR);
    exit_section_(b, m, FOR_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // E_FOREACH
  public static boolean foreach_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_expr")) return false;
    if (!nextTokenIs(b, E_FOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_FOREACH);
    exit_section_(b, m, FOREACH_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // K_FUNCTION
  public static boolean function_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_keyword")) return false;
    if (!nextTokenIs(b, K_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_FUNCTION);
    exit_section_(b, m, FUNCTION_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // E_GOTO
  public static boolean goto_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goto_expr")) return false;
    if (!nextTokenIs(b, E_GOTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_GOTO);
    exit_section_(b, m, GOTO_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // T_IDENTIFIER
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, T_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_IDENTIFIER);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // E_IF
  public static boolean if_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr")) return false;
    if (!nextTokenIs(b, E_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_IF);
    exit_section_(b, m, IF_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // A_IMPLEMENTS
  public static boolean implements_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_alias")) return false;
    if (!nextTokenIs(b, A_IMPLEMENTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, A_IMPLEMENTS);
    exit_section_(b, m, IMPLEMENTS_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // K_INTERFACE
  public static boolean interface_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_keyword")) return false;
    if (!nextTokenIs(b, K_INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_INTERFACE);
    exit_section_(b, m, INTERFACE_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // C_LBRACE
  public static boolean lbrace_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lbrace_char")) return false;
    if (!nextTokenIs(b, C_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_LBRACE);
    exit_section_(b, m, LBRACE_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // C_LBRACKET
  public static boolean lbracket_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lbracket_char")) return false;
    if (!nextTokenIs(b, C_LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_LBRACKET);
    exit_section_(b, m, LBRACKET_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // C_LPAREN
  public static boolean lparen_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lparen_char")) return false;
    if (!nextTokenIs(b, C_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_LPAREN);
    exit_section_(b, m, LPAREN_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // K_NAMESPACE
  public static boolean namespace_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_keyword")) return false;
    if (!nextTokenIs(b, K_NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_NAMESPACE);
    exit_section_(b, m, NAMESPACE_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // T_OPEN_TAG
  public static boolean open_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_tag")) return false;
    if (!nextTokenIs(b, T_OPEN_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_OPEN_TAG);
    exit_section_(b, m, OPEN_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // phpToken? phpToken*
  static boolean phpFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = phpFile_0(b, l + 1);
    r = r && phpFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // phpToken?
  private static boolean phpFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpFile_0")) return false;
    phpToken(b, l + 1);
    return true;
  }

  // phpToken*
  private static boolean phpFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!phpToken(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "phpFile_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // white_space 
  //     | open_tag | close_tag
  //     | comma_char | semicolon_char | backslash_char
  //     | lbracket_char | rbracket_char | lbrace_char | rbrace_char
  //     | pipe_char | question_char | colon_char | dcolon_char | arrow_char | darrow_char
  //     | lparen_char | rparen_char
  //     | namespace_keyword | use_keyword | function_keyword | class_keyword
  //     | interface_keyword | trait_keyword | enum_keyword
  //     | as_alias | implements_alias | extends_alias
  //     | public_modifier | protected_modifier | private_modifier | static_modifier
  //     | abstract_modifier | final_modifier | const_modifier | self_modifier
  //     | if_expr | else_expr | while_expr | for_expr | foreach_expr | switch_expr | case_expr
  //     | default_expr | break_expr | continue_expr | return_expr | throw_expr
  //     | do_expr | try_expr | catch_expr | finally_expr | goto_expr
  //     | this_link
  //     | digit
  //     | variable
  //     | identifier
  public static boolean phpToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpToken")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PHP_TOKEN, "<php token>");
    r = white_space(b, l + 1);
    if (!r) r = open_tag(b, l + 1);
    if (!r) r = close_tag(b, l + 1);
    if (!r) r = comma_char(b, l + 1);
    if (!r) r = semicolon_char(b, l + 1);
    if (!r) r = backslash_char(b, l + 1);
    if (!r) r = lbracket_char(b, l + 1);
    if (!r) r = rbracket_char(b, l + 1);
    if (!r) r = lbrace_char(b, l + 1);
    if (!r) r = rbrace_char(b, l + 1);
    if (!r) r = pipe_char(b, l + 1);
    if (!r) r = question_char(b, l + 1);
    if (!r) r = colon_char(b, l + 1);
    if (!r) r = dcolon_char(b, l + 1);
    if (!r) r = arrow_char(b, l + 1);
    if (!r) r = darrow_char(b, l + 1);
    if (!r) r = lparen_char(b, l + 1);
    if (!r) r = rparen_char(b, l + 1);
    if (!r) r = namespace_keyword(b, l + 1);
    if (!r) r = use_keyword(b, l + 1);
    if (!r) r = function_keyword(b, l + 1);
    if (!r) r = class_keyword(b, l + 1);
    if (!r) r = interface_keyword(b, l + 1);
    if (!r) r = trait_keyword(b, l + 1);
    if (!r) r = enum_keyword(b, l + 1);
    if (!r) r = as_alias(b, l + 1);
    if (!r) r = implements_alias(b, l + 1);
    if (!r) r = extends_alias(b, l + 1);
    if (!r) r = public_modifier(b, l + 1);
    if (!r) r = protected_modifier(b, l + 1);
    if (!r) r = private_modifier(b, l + 1);
    if (!r) r = static_modifier(b, l + 1);
    if (!r) r = abstract_modifier(b, l + 1);
    if (!r) r = final_modifier(b, l + 1);
    if (!r) r = const_modifier(b, l + 1);
    if (!r) r = self_modifier(b, l + 1);
    if (!r) r = if_expr(b, l + 1);
    if (!r) r = else_expr(b, l + 1);
    if (!r) r = while_expr(b, l + 1);
    if (!r) r = for_expr(b, l + 1);
    if (!r) r = foreach_expr(b, l + 1);
    if (!r) r = switch_expr(b, l + 1);
    if (!r) r = case_expr(b, l + 1);
    if (!r) r = default_expr(b, l + 1);
    if (!r) r = break_expr(b, l + 1);
    if (!r) r = continue_expr(b, l + 1);
    if (!r) r = return_expr(b, l + 1);
    if (!r) r = throw_expr(b, l + 1);
    if (!r) r = do_expr(b, l + 1);
    if (!r) r = try_expr(b, l + 1);
    if (!r) r = catch_expr(b, l + 1);
    if (!r) r = finally_expr(b, l + 1);
    if (!r) r = goto_expr(b, l + 1);
    if (!r) r = this_link(b, l + 1);
    if (!r) r = digit(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_PIPE
  public static boolean pipe_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe_char")) return false;
    if (!nextTokenIs(b, C_PIPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_PIPE);
    exit_section_(b, m, PIPE_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // M_PRIVATE
  public static boolean private_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_modifier")) return false;
    if (!nextTokenIs(b, M_PRIVATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_PRIVATE);
    exit_section_(b, m, PRIVATE_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // M_PROTECTED
  public static boolean protected_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_modifier")) return false;
    if (!nextTokenIs(b, M_PROTECTED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_PROTECTED);
    exit_section_(b, m, PROTECTED_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // M_PUBLIC
  public static boolean public_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "public_modifier")) return false;
    if (!nextTokenIs(b, M_PUBLIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_PUBLIC);
    exit_section_(b, m, PUBLIC_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // C_QUESTION
  public static boolean question_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "question_char")) return false;
    if (!nextTokenIs(b, C_QUESTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_QUESTION);
    exit_section_(b, m, QUESTION_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // C_RBRACE
  public static boolean rbrace_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rbrace_char")) return false;
    if (!nextTokenIs(b, C_RBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_RBRACE);
    exit_section_(b, m, RBRACE_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // C_RBRACKET
  public static boolean rbracket_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rbracket_char")) return false;
    if (!nextTokenIs(b, C_RBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_RBRACKET);
    exit_section_(b, m, RBRACKET_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // E_RETURN
  public static boolean return_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_expr")) return false;
    if (!nextTokenIs(b, E_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_RETURN);
    exit_section_(b, m, RETURN_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // C_RPAREN
  public static boolean rparen_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rparen_char")) return false;
    if (!nextTokenIs(b, C_RPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_RPAREN);
    exit_section_(b, m, RPAREN_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // M_SELF
  public static boolean self_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_modifier")) return false;
    if (!nextTokenIs(b, M_SELF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_SELF);
    exit_section_(b, m, SELF_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // C_SEMICOLON
  public static boolean semicolon_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semicolon_char")) return false;
    if (!nextTokenIs(b, C_SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_SEMICOLON);
    exit_section_(b, m, SEMICOLON_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // M_STATIC
  public static boolean static_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_modifier")) return false;
    if (!nextTokenIs(b, M_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, M_STATIC);
    exit_section_(b, m, STATIC_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // E_SWITCH
  public static boolean switch_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expr")) return false;
    if (!nextTokenIs(b, E_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_SWITCH);
    exit_section_(b, m, SWITCH_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // T_THIS
  public static boolean this_link(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_link")) return false;
    if (!nextTokenIs(b, T_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_THIS);
    exit_section_(b, m, THIS_LINK, r);
    return r;
  }

  /* ********************************************************** */
  // E_THROW
  public static boolean throw_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throw_expr")) return false;
    if (!nextTokenIs(b, E_THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_THROW);
    exit_section_(b, m, THROW_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // K_TRAIT
  public static boolean trait_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_keyword")) return false;
    if (!nextTokenIs(b, K_TRAIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_TRAIT);
    exit_section_(b, m, TRAIT_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // E_TRY
  public static boolean try_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr")) return false;
    if (!nextTokenIs(b, E_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_TRY);
    exit_section_(b, m, TRY_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // K_USE
  public static boolean use_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_keyword")) return false;
    if (!nextTokenIs(b, K_USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_USE);
    exit_section_(b, m, USE_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // T_VARIABLE
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_VARIABLE);
    exit_section_(b, m, VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // E_WHILE
  public static boolean while_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_expr")) return false;
    if (!nextTokenIs(b, E_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E_WHILE);
    exit_section_(b, m, WHILE_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // T_WHITE_SPACE+
  public static boolean white_space(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "white_space")) return false;
    if (!nextTokenIs(b, T_WHITE_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_WHITE_SPACE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, T_WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "white_space", c)) break;
    }
    exit_section_(b, m, WHITE_SPACE, r);
    return r;
  }

}
