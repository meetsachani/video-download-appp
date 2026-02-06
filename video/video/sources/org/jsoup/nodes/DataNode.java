package org.jsoup.nodes;

import o.C2730De2;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.nodes.Document;

/* loaded from: classes4.dex */
public class DataNode extends LeafNode {
    public DataNode(String str) {
        super(str);
    }

    public DataNode A1(String str) {
        s1(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        String z1 = z1();
        if (outputSettings.p() == Document.OutputSettings.Syntax.xml && !z1.contains("<![CDATA[")) {
            if (R0(C2730De2.r)) {
                quietAppendable.b("//<![CDATA[\n").b(z1).b("\n//]]>");
                return;
            } else if (R0("style")) {
                quietAppendable.b("/*<![CDATA[*/\n").b(z1).b("\n/*]]>*/");
                return;
            } else {
                quietAppendable.b("<![CDATA[").b(z1).b("]]>");
                return;
            }
        }
        quietAppendable.b(z1);
    }

    @Override // org.jsoup.nodes.Node
    public String w0() {
        return "#data";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: y1 */
    public DataNode clone() {
        return (DataNode) super.clone();
    }

    public String z1() {
        return r1();
    }
}
