package org.jsoup.nodes;

import org.jsoup.internal.QuietAppendable;
import org.jsoup.nodes.Document;

/* loaded from: classes4.dex */
public class CDataNode extends TextNode {
    public CDataNode(String str) {
        super(str);
    }

    @Override // org.jsoup.nodes.TextNode
    public String J1() {
        return A1();
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        quietAppendable.b("<![CDATA[").b(A1()).b("]]>");
    }

    @Override // org.jsoup.nodes.TextNode
    /* renamed from: L1 */
    public CDataNode y1() {
        return (CDataNode) super.clone();
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public String w0() {
        return "#cdata";
    }
}
