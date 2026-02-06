package org.jsoup.safety;

import com.facebook.C2383l;
import com.facebook.appevents.Q;
import com.facebook.gamingservices.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C5445bv2;
import o.C8192n71;
import o.C9642t32;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Functions;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

/* loaded from: classes4.dex */
public class Safelist {
    public static final String f = ":all";
    public final Set<TagName> a;
    public final Map<TagName, Set<AttributeKey>> b;
    public final Map<TagName, Map<AttributeKey, AttributeValue>> c;
    public final Map<TagName, Map<AttributeKey, Set<Protocol>>> d;
    public boolean e;

    /* loaded from: classes4.dex */
    public static class AttributeKey extends TypedValue {
        public AttributeKey(String str) {
            super(str);
        }

        public static AttributeKey a(String str) {
            return new AttributeKey(Normalizer.a(str));
        }
    }

    /* loaded from: classes4.dex */
    public static class AttributeValue extends TypedValue {
        public AttributeValue(String str) {
            super(str);
        }

        public static AttributeValue a(String str) {
            return new AttributeValue(str);
        }
    }

    /* loaded from: classes4.dex */
    public static class Protocol extends TypedValue {
        public Protocol(String str) {
            super(str);
        }

        public static Protocol a(String str) {
            return new Protocol(str);
        }
    }

    /* loaded from: classes4.dex */
    public static class TagName extends TypedValue {
        public TagName(String str) {
            super(str);
        }

        public static TagName a(String str) {
            return new TagName(Normalizer.a(str));
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class TypedValue {
        public final String a;

        public TypedValue(String str) {
            Validate.q(str);
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return Objects.equals(this.a, ((TypedValue) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a;
        }
    }

    public Safelist() {
        this.a = new HashSet();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = false;
    }

    public static Safelist e() {
        return new Safelist().d("a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", Q.k, "i", "li", "ol", "p", "pre", q.a, "small", C5445bv2.s, "strike", "strong", C2383l.x1, "sup", "u", "ul").a("a", C9642t32.j).a("blockquote", "cite").a(q.a, "cite").c("a", C9642t32.j, "ftp", "http", "https", C8192n71.c).c("blockquote", "cite", "http", "https").c("cite", "cite", "http", "https").b("a", "rel", "nofollow");
    }

    public static Safelist f() {
        return e().d("img").a("img", "align", "alt", "height", "src", "title", "width").c("img", "src", "http", "https");
    }

    public static boolean j(String str) {
        if (str.startsWith("#") && !str.matches(".*\\s.*")) {
            return true;
        }
        return false;
    }

    public static Safelist k() {
        return new Safelist();
    }

    public static Safelist n() {
        return new Safelist().d("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", C5445bv2.q, "dl", "dt", Q.k, "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", q.a, "small", C5445bv2.s, "strike", "strong", C2383l.x1, "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").a("a", C9642t32.j, "title").a("blockquote", "cite").a("col", C5445bv2.s, "width").a("colgroup", C5445bv2.s, "width").a("img", "align", "alt", "height", "src", "title", "width").a("ol", "start", "type").a(q.a, "cite").a("table", "summary", "width").a("td", "abbr", "axis", "colspan", "rowspan", "width").a("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").a("ul", "type").c("a", C9642t32.j, "ftp", "http", "https", C8192n71.c).c("blockquote", "cite", "http", "https").c("cite", "cite", "http", "https").c("img", "src", "http", "https").c(q.a, "cite", "http", "https");
    }

    public static Safelist s() {
        return new Safelist().d("b", Q.k, "i", "strong", "u");
    }

    public Safelist a(String str, String... strArr) {
        boolean z;
        Validate.n(str);
        Validate.q(strArr);
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "No attribute names supplied.");
        d(str);
        TagName a = TagName.a(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.n(str2);
            hashSet.add(AttributeKey.a(str2));
        }
        this.b.computeIfAbsent(a, Functions.h()).addAll(hashSet);
        return this;
    }

    public Safelist b(String str, String str2, String str3) {
        Validate.n(str);
        Validate.n(str2);
        Validate.n(str3);
        TagName a = TagName.a(str);
        this.a.add(a);
        this.c.computeIfAbsent(a, Functions.g()).put(AttributeKey.a(str2), AttributeValue.a(str3));
        return this;
    }

    public Safelist c(String str, String str2, String... strArr) {
        Validate.n(str);
        Validate.n(str2);
        Validate.q(strArr);
        Set<Protocol> computeIfAbsent = this.d.computeIfAbsent(TagName.a(str), Functions.g()).computeIfAbsent(AttributeKey.a(str2), Functions.h());
        for (String str3 : strArr) {
            Validate.n(str3);
            computeIfAbsent.add(Protocol.a(str3));
        }
        return this;
    }

    public Safelist d(String... strArr) {
        Validate.q(strArr);
        for (String str : strArr) {
            Validate.n(str);
            Validate.i(str.equalsIgnoreCase("noscript"), "noscript is unsupported in Safelists, due to incompatibilities between parsers with and without script-mode enabled");
            this.a.add(TagName.a(str));
        }
        return this;
    }

    public Attributes g(String str) {
        Attributes attributes = new Attributes();
        TagName a = TagName.a(str);
        if (this.c.containsKey(a)) {
            for (Map.Entry<AttributeKey, AttributeValue> entry : this.c.get(a).entrySet()) {
                attributes.h0(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        return attributes;
    }

    public boolean h(String str, Element element, Attribute attribute) {
        TagName a = TagName.a(str);
        AttributeKey a2 = AttributeKey.a(attribute.getKey());
        Set<AttributeKey> set = this.b.get(a);
        if (set != null && set.contains(a2)) {
            if (this.d.containsKey(a)) {
                Map<AttributeKey, Set<Protocol>> map = this.d.get(a);
                if (map.containsKey(a2) && !t(element, attribute, map.get(a2))) {
                    return false;
                }
            }
            return true;
        }
        if (this.c.get(a) != null) {
            Attributes g = g(str);
            String key = attribute.getKey();
            if (g.M(key)) {
                return g.G(key).equals(attribute.getValue());
            }
        }
        if (str.equals(f) || !h(f, element, attribute)) {
            return false;
        }
        return true;
    }

    public boolean i(String str) {
        return this.a.contains(TagName.a(str));
    }

    public Safelist l(boolean z) {
        this.e = z;
        return this;
    }

    public boolean m() {
        return this.e;
    }

    public Safelist o(String str, String... strArr) {
        boolean z;
        Validate.n(str);
        Validate.q(strArr);
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.k(z, "No attribute names supplied.");
        TagName a = TagName.a(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.n(str2);
            hashSet.add(AttributeKey.a(str2));
        }
        if (this.a.contains(a) && this.b.containsKey(a)) {
            Set<AttributeKey> set = this.b.get(a);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.b.remove(a);
            }
        }
        if (str.equals(f)) {
            Iterator<Map.Entry<TagName, Set<AttributeKey>>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                Set<AttributeKey> value = it.next().getValue();
                value.removeAll(hashSet);
                if (value.isEmpty()) {
                    it.remove();
                }
            }
        }
        return this;
    }

    public Safelist p(String str, String str2) {
        Validate.n(str);
        Validate.n(str2);
        TagName a = TagName.a(str);
        if (this.a.contains(a) && this.c.containsKey(a)) {
            AttributeKey a2 = AttributeKey.a(str2);
            Map<AttributeKey, AttributeValue> map = this.c.get(a);
            map.remove(a2);
            if (map.isEmpty()) {
                this.c.remove(a);
            }
        }
        return this;
    }

    public Safelist q(String str, String str2, String... strArr) {
        Validate.n(str);
        Validate.n(str2);
        Validate.q(strArr);
        TagName a = TagName.a(str);
        AttributeKey a2 = AttributeKey.a(str2);
        Validate.k(this.d.containsKey(a), "Cannot remove a protocol that is not set.");
        Map<AttributeKey, Set<Protocol>> map = this.d.get(a);
        Validate.k(map.containsKey(a2), "Cannot remove a protocol that is not set.");
        Set<Protocol> set = map.get(a2);
        for (String str3 : strArr) {
            Validate.n(str3);
            set.remove(Protocol.a(str3));
        }
        if (set.isEmpty()) {
            map.remove(a2);
            if (map.isEmpty()) {
                this.d.remove(a);
            }
        }
        return this;
    }

    public Safelist r(String... strArr) {
        Validate.q(strArr);
        for (String str : strArr) {
            Validate.n(str);
            TagName a = TagName.a(str);
            if (this.a.remove(a)) {
                this.b.remove(a);
                this.c.remove(a);
                this.d.remove(a);
            }
        }
        return this;
    }

    public final boolean t(Element element, Attribute attribute, Set<Protocol> set) {
        String d = element.d(attribute.getKey());
        if (d.length() == 0) {
            d = attribute.getValue();
        }
        if (!this.e) {
            attribute.setValue(d);
        }
        for (Protocol protocol : set) {
            String typedValue = protocol.toString();
            if (typedValue.equals("#")) {
                if (j(d)) {
                    return true;
                }
            } else {
                if (Normalizer.a(d).startsWith(typedValue + ":")) {
                    return true;
                }
            }
        }
        return false;
    }

    public Safelist(Safelist safelist) {
        this();
        this.a.addAll(safelist.a);
        for (Map.Entry<TagName, Set<AttributeKey>> entry : safelist.b.entrySet()) {
            this.b.put(entry.getKey(), new HashSet(entry.getValue()));
        }
        for (Map.Entry<TagName, Map<AttributeKey, AttributeValue>> entry2 : safelist.c.entrySet()) {
            this.c.put(entry2.getKey(), new HashMap(entry2.getValue()));
        }
        for (Map.Entry<TagName, Map<AttributeKey, Set<Protocol>>> entry3 : safelist.d.entrySet()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<AttributeKey, Set<Protocol>> entry4 : entry3.getValue().entrySet()) {
                hashMap.put(entry4.getKey(), new HashSet(entry4.getValue()));
            }
            this.d.put(entry3.getKey(), hashMap);
        }
        this.e = safelist.e;
    }
}
