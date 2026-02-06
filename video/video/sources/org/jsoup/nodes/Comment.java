package org.jsoup.nodes;

import com.google.firebase.messaging.TopicOperation;
import java.util.List;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: classes4.dex */
public class Comment extends LeafNode {
    public Comment(String str) {
        super(str);
    }

    public static boolean E1(String str) {
        if (str.length() > 1) {
            if (str.startsWith(TopicOperation.d) || str.startsWith("?")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String A1() {
        return r1();
    }

    public boolean B1() {
        return E1(A1());
    }

    public Comment F1(String str) {
        s1(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public void K0(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        quietAppendable.b("<!--").b(A1()).b("-->");
    }

    @Override // org.jsoup.nodes.Node
    public String w0() {
        return "#comment";
    }

    public XmlDeclaration y1() {
        List<Node> o2 = Parser.z().o("<" + A1() + ">", null, "");
        if (o2.isEmpty() || !(o2.get(0) instanceof XmlDeclaration)) {
            return null;
        }
        return (XmlDeclaration) o2.get(0);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: z1 */
    public Comment clone() {
        return (Comment) super.clone();
    }
}
