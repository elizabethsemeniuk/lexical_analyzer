package com.company;

import java.util.regex.*;

public class C_Sharp {

    public enum Type {
        // STRING AND NUMBERS
        Type_string("\"[^\"]+\""), Type_number("\\d+(\\.\\d+)?"), Type_identity("\\w+\\b"),
        // Preprocessor directives
        Type_include("#include\\b"), Type_define("#define\\b"), Type_undef("#undef\\b"),
        Type_if("#if\\b"),  Type_else_t("#else\\b"), Type_elif("#elif\\b"), Type_endif("#endif\\b"),
        Type_nullable("#nullable\\b"), Type_line("#line\\b"), Type_error("#error\\b"), Type_pragma("#pragma\\b"),
        Type_region("#region\\b"), Type_endregion("#endregion\\b"),
        // C++ tokens
        Type_abstract("abstract\\b"), Type_event("event\\b"), Type_static("static\\b"), Type_explicit("explicit\\b"),
        Type_new("new\\b"), Type_base("base\\b"), Type_break("break\\b"), Type_case("case\\b"), Type_char("char\\b"),
        Type_class("class\\b"), Type_continue("continue\\b"), Type_default("default\\b"), Type_do("do\\b"),
        Type_finally("finally\\b"), Type_try("try\\b"), Type_catch("catch\\b"), Type_float("float\\b"),
        Type_int("int\\b"), Type_null("null\\b"), Type_override("override\\b"), Type_private("private\\b"),
        Type_public("public\\b"), Type_sizeof("sizeof\\b"), Type_virtual("virtual\\b"), Type_namespace("namespace\\b"),
        Type_void("void\\b"), Type_return("return\\b"), Type_bool("bool\\b"), Type_const("const\\b"), Type_double("double\\b"),
        Type_false("false\\b"), Type_true("true\\b"), Type_value("value\\b"), Type_while("while\\b"), Type_for("for\\b"),
        Type_in("in\\b"), Type_readonly("readonly\\b"), Type_throw("throw\\b"), Type_get("get\\b"), Type_set("set\\b"),
        // C++ marks
        Type_not("!"), Type_assign("="), Type_pointer("\\*\\*"), Type_select("->"), Type_qustion("\\?"), Type_colon("colon"), Type_and("\\&\\&"), Type_or("\\|\\|"), Type_equal("\\=\\="),
        Type_notequal("!="), Type_increment("\\+\\+"), Type_decrement("--"), Type_power("\\^"), Type_procent("%"), Type_binleftshift("\\<\\<\\b"), Type_binrightshift("\\>\\>\\b"), Type_plusequal("\\+\\="),
        Type_minuseuqal("-="), Type_multiplyequal("\\*="), Type_divideandequal("/="), Type_andequal("&="), Type_orequal("\\|="), Type_percentequal("%="), Type_xorequal("\\^\\="), Type_binshiftlefteuqal("<<="),
        Type_binshiftrightequal(">>="), Type_lessorequal("\\<\\="), Type_greaterorequal("\\>\\="), Type_greater(">"), Type_less("\\<"), Type_plus("\\+"), Type_minus("-"), Type_multiply("\\*"),
        Type_division("\\/"), Type_adress("&"), Type_singleof("\\|"), Type_openbracket("\\("), Type_closebracket("\\)"), Type_curlyopenbracket("\\{"), Type_curlyclosebracket("\\}"), Type_semicolon("\\;"),
        Type_coma("\\,"), Type_point("\\."), Type_squareopen("\\["), Type_squareclose("\\]"), Type_comment("//"), Type_commentstar("\\/\\*"), Type_startcomment("\\*\\/"), Type_doublebracket("\""),
        Type_onebracket("\'"),
        //other symbols
        Type_trash("trash");

        public Pattern pattern;

        Type(String str) {
            pattern = Pattern.compile("^" + str);
        }

        int Match(String str) {
            Matcher m = pattern.matcher(str);

            if (m.find()) {
                return m.end();
            }

            return -1;
        }
    }

}
