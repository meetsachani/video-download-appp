package org.jsoup.nodes;

import com.google.firebase.messaging.TopicOperation;
import java.util.Iterator;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes4.dex */
public class XmlDeclaration extends LeafNode {
    public final boolean b1;

    public XmlDeclaration(String str, boolean z) {
        super(str);
        this.b1 = z;
    }

    public final void A1(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        Iterator<Attribute> it = p().iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (!key.equals(w0())) {
                quietAppendable.a(' ');
                quietAppendable.b(key);
                if (!value.isEmpty()) {
                    quietAppendable.b("=\"");
                    Entities.n(quietAppendable, value, outputSettings, 2);
                    quietAppendable.a('\"');
                }
            }
        }
    }

    public String B1() {
        return r1();
    }

    @Override // org.jsoup.nodes.Node
    public void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        String str;
        QuietAppendable b = quietAppendable.b("<");
        String str2 = "?";
        if (!this.b1) {
            str = "?";
        } else {
            str = TopicOperation.d;
        }
        b.b(str).b(r1());
        A1(quietAppendable, outputSettings);
        if (this.b1) {
            str2 = "";
        }
        quietAppendable.b(str2).b(">");
    }

    @Override // org.jsoup.nodes.LeafNode, org.jsoup.nodes.Node
    public void L0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return F0();
    }

    @Override // org.jsoup.nodes.Node
    public String w0() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: y1 */
    public XmlDeclaration clone() {
        return (XmlDeclaration) super.clone();
    }

    public String z1() {
        StringBuilder e = StringUtil.e();
        A1(QuietAppendable.d(e), new Document.OutputSettings());
        return StringUtil.x(e).trim();
    }
}
