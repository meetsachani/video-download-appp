package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C6566gU0;
import o.Q32;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

/* loaded from: classes4.dex */
public class FormElement extends Element {
    public static final Evaluator k1 = Selector.b(StringUtil.s(SharedConstants.g, C6566gU0.h));
    public final Elements j1;

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
        this.j1 = new Elements();
    }

    public FormElement R4(Element element) {
        this.j1.add(element);
        return this;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: S4 */
    public FormElement clone() {
        return (FormElement) super.clone();
    }

    public Elements T4() {
        Elements c4 = c4(k1);
        Iterator<T> it = this.j1.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.N0() != null && !c4.contains(element)) {
                c4.add(element);
            }
        }
        return c4;
    }

    public List<Connection.KeyVal> U4() {
        Element d4;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = T4().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.A4().i() && !element.j0("disabled")) {
                String k = element.k("name");
                if (k.length() != 0) {
                    String k2 = element.k("type");
                    if (!k2.equalsIgnoreCase("button") && !k2.equalsIgnoreCase("image")) {
                        if (element.t0("select")) {
                            Iterator<T> it2 = element.b4("option[selected]").iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                arrayList.add(HttpConnection.KeyVal.g(k, ((Element) it2.next()).L4()));
                                z = true;
                            }
                            if (!z && (d4 = element.d4("option")) != null) {
                                arrayList.add(HttpConnection.KeyVal.g(k, d4.L4()));
                            }
                        } else if (!"checkbox".equalsIgnoreCase(k2) && !"radio".equalsIgnoreCase(k2)) {
                            arrayList.add(HttpConnection.KeyVal.g(k, element.L4()));
                        } else if (element.j0("checked")) {
                            if (element.L4().length() > 0) {
                                str = element.L4();
                            } else {
                                str = "on";
                            }
                            arrayList.add(HttpConnection.KeyVal.g(k, str));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public Connection V4() {
        String w;
        Connection.Method method;
        Connection f;
        if (j0("action")) {
            w = d("action");
        } else {
            w = w();
        }
        Validate.o(w, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        if (k("method").equalsIgnoreCase(Q32.j)) {
            method = Connection.Method.POST;
        } else {
            method = Connection.Method.GET;
        }
        Document N0 = N0();
        if (N0 != null) {
            f = N0.V4().v();
        } else {
            f = Jsoup.f();
        }
        return f.B(w).h(U4()).n(method);
    }

    @Override // org.jsoup.nodes.Node
    public void a1(Node node) {
        super.a1(node);
        this.j1.remove(node);
    }
}
