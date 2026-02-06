package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes4.dex */
public class TextNode extends LeafNode {
    public TextNode(String str) {
        super(str);
    }

    public static boolean E1(StringBuilder sb) {
        if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ') {
            return true;
        }
        return false;
    }

    public static String F1(String str) {
        return StringUtil.u(str);
    }

    public static String H1(String str) {
        return str.replaceFirst("^\\s+", "");
    }

    public static TextNode z1(String str) {
        return new TextNode(Entities.v(str));
    }

    public String A1() {
        return r1();
    }

    public boolean B1() {
        return StringUtil.k(r1());
    }

    public TextNode G1(int i) {
        boolean z;
        boolean z2;
        String r1 = r1();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "Split offset must be not be negative");
        if (i < r1.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.k(z2, "Split offset must not be greater than current text length");
        String substring = r1.substring(0, i);
        String substring2 = r1.substring(i);
        K1(substring);
        TextNode textNode = new TextNode(substring2);
        Element element = this.X;
        if (element != null) {
            element.e(k1() + 1, textNode);
        }
        return textNode;
    }

    public String J1() {
        return StringUtil.u(A1());
    }

    @Override // org.jsoup.nodes.Node
    public void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        Entities.n(quietAppendable, r1(), outputSettings, 1);
    }

    public TextNode K1(String str) {
        s1(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return F0();
    }

    @Override // org.jsoup.nodes.Node
    public String w0() {
        return "#text";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: y1 */
    public TextNode clone() {
        return (TextNode) super.clone();
    }
}
