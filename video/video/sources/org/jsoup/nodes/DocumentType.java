package org.jsoup.nodes;

import o.C4500Ve2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes4.dex */
public class DocumentType extends LeafNode {
    public static final String b1 = "PUBLIC";
    public static final String c1 = "SYSTEM";
    public static final String d1 = "name";
    public static final String e1 = "pubSysKey";
    public static final String f1 = "publicId";
    public static final String g1 = "systemId";

    public DocumentType(String str, String str2, String str3) {
        super(str);
        Validate.q(str2);
        Validate.q(str3);
        p().f("name", str).f(f1, str2).f(g1, str3);
        F1();
    }

    public String A1() {
        return k(f1);
    }

    public void B1(String str) {
        if (str != null) {
            l(e1, str);
        }
    }

    public String E1() {
        return k(g1);
    }

    public final void F1() {
        if (y1(f1)) {
            p().f(e1, b1);
        } else if (y1(g1)) {
            p().f(e1, c1);
        }
    }

    @Override // org.jsoup.nodes.Node
    public void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        if (outputSettings.p() == Document.OutputSettings.Syntax.html && !y1(f1) && !y1(g1)) {
            quietAppendable.b("<!doctype");
        } else {
            quietAppendable.b("<!DOCTYPE");
        }
        if (y1("name")) {
            quietAppendable.b(C4500Ve2.b).b(k("name"));
        }
        if (y1(e1)) {
            quietAppendable.b(C4500Ve2.b).b(k(e1));
        }
        if (y1(f1)) {
            quietAppendable.b(" \"").b(k(f1)).a('\"');
        }
        if (y1(g1)) {
            quietAppendable.b(" \"").b(k(g1)).a('\"');
        }
        quietAppendable.a('>');
    }

    @Override // org.jsoup.nodes.Node
    public String w0() {
        return "#doctype";
    }

    public final boolean y1(String str) {
        return !StringUtil.k(k(str));
    }

    public String z1() {
        return k("name");
    }
}
