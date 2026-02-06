package org.jsoup.parser;

import com.facebook.C2381j;
import com.facebook.C2383l;
import com.facebook.appevents.Q;
import com.facebook.gamingservices.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import o.C10928yK2;
import o.C2730De2;
import o.C4317Th1;
import o.C5445bv2;
import o.C9796th2;
import o.C9998uW1;
import o.InterfaceC8148mw2;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SharedConstants;
import org.jsoup.parser.Tag;
import org.jsoup.parser.TagSet;

/* loaded from: classes4.dex */
public class TagSet {
    public static final TagSet d = s();
    public final Map<String, Map<String, Tag>> a;
    public final TagSet b;
    public ArrayList<Consumer<Tag>> c;

    public TagSet() {
        this.a = new HashMap();
        this.b = null;
    }

    public static /* synthetic */ Map k(String str) {
        return new HashMap();
    }

    public static TagSet o() {
        return new TagSet(d);
    }

    public static TagSet s() {
        String[] strArr = {"html", C5445bv2.f701o, "body", "frameset", C2730De2.r, "noscript", "style", "meta", "link", "title", InterfaceC8148mw2.a.L, "noframes", "section", "nav", "aside", "hgroup", C2381j.e1, "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "br", "button", "ul", "ol", "pre", C5445bv2.q, "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", C9796th2.f, "plaintext", C9998uW1.b0, "article", "main", C5445bv2.m0, C9998uW1.b0, "dir", "applet", "marquee", "listing", "#root"};
        String[] strArr2 = {"object", C5445bv2.X, C4317Th1.q, C5445bv2.n, "i", "b", "u", "big", "small", Q.k, "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", C10928yK2.w, "rp", "rtc", "a", "img", "wbr", "map", q.a, C2383l.x1, "sup", "bdo", "iframe", "embed", C5445bv2.s, "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb"};
        String[] strArr3 = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", C2730De2.r, "style", "ins", "del", "s", "button"};
        String[] strArr4 = {"meta", "link", C5445bv2.X, InterfaceC8148mw2.a.L, "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        String[] strArr5 = {"pre", "plaintext", "title", "textarea", C2730De2.r};
        String[] strArr6 = {"iframe", "noembed", "noframes", C2730De2.r, "style", "xmp"};
        String[] strArr7 = SharedConstants.g;
        return new TagSet().u(Parser.b1, strArr, new Consumer() { // from class: o.Yk2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.b1);
            }
        }).u(Parser.b1, strArr2, new Consumer() { // from class: o.cl2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(0);
            }
        }).u(Parser.b1, strArr3, new Consumer() { // from class: o.dl2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.c1);
            }
        }).u(Parser.b1, strArr4, new Consumer() { // from class: o.el2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.a1);
            }
        }).u(Parser.b1, strArr5, new Consumer() { // from class: o.fl2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.f1);
            }
        }).u(Parser.b1, new String[]{"title", "textarea"}, new Consumer() { // from class: o.gl2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.g1);
            }
        }).u(Parser.b1, strArr6, new Consumer() { // from class: o.Uk2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.h1);
            }
        }).u(Parser.b1, strArr7, new Consumer() { // from class: o.Vk2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.i1);
            }
        }).u(Parser.d1, new String[]{"math"}, new Consumer() { // from class: o.Wk2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.b1);
            }
        }).u(Parser.d1, new String[]{"mi", "mo", "msup", "mn", "mtext"}, new Consumer() { // from class: o.Xk2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(0);
            }
        }).u(Parser.e1, new String[]{"svg", "femerge", "femergenode"}, new Consumer() { // from class: o.Zk2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.b1);
            }
        }).u(Parser.e1, new String[]{"text"}, new Consumer() { // from class: o.al2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(0);
            }
        }).u(Parser.e1, new String[]{C2730De2.r}, new Consumer() { // from class: o.bl2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Tag) obj).v(Tag.h1);
            }
        });
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TagSet)) {
            return false;
        }
        return Objects.equals(this.a, ((TagSet) obj).a);
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public TagSet p(Tag tag) {
        tag.v(Tag.Z0);
        q(tag);
        return this;
    }

    public final void q(Tag tag) {
        ArrayList<Consumer<Tag>> arrayList = this.c;
        if (arrayList != null) {
            Iterator<Consumer<Tag>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().accept(tag);
            }
        }
        this.a.computeIfAbsent(tag.X, new Function() { // from class: o.Tk2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TagSet.k((String) obj);
            }
        }).put(tag.Y, tag);
    }

    public Tag r(String str, String str2) {
        Tag r;
        Tag tag;
        Validate.q(str);
        Validate.q(str2);
        Map<String, Tag> map = this.a.get(str2);
        if (map != null && (tag = map.get(str)) != null) {
            return tag;
        }
        TagSet tagSet = this.b;
        if (tagSet != null && (r = tagSet.r(str, str2)) != null) {
            Tag clone = r.clone();
            q(clone);
            return clone;
        }
        return null;
    }

    public TagSet t(Consumer<Tag> consumer) {
        Validate.q(consumer);
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.add(consumer);
        return this;
    }

    public final TagSet u(String str, String[] strArr, Consumer<Tag> consumer) {
        for (String str2 : strArr) {
            Tag r = r(str2, str);
            if (r == null) {
                r = new Tag(str2, str2, str);
                r.Y0 = 0;
                p(r);
            }
            consumer.accept(r);
        }
        return this;
    }

    public Tag v(String str, String str2) {
        return x(str, str2, ParseSettings.d);
    }

    public Tag w(String str, String str2, String str3, boolean z) {
        Validate.q(str);
        Validate.q(str3);
        String trim = str.trim();
        Validate.n(trim);
        Tag r = r(trim, str3);
        if (r != null) {
            return r;
        }
        if (str2 == null) {
            str2 = ParseSettings.a(trim);
        }
        if (!z) {
            trim = str2;
        }
        Tag r2 = r(str2, str3);
        if (r2 != null) {
            if (z && !trim.equals(str2)) {
                Tag clone = r2.clone();
                clone.Y = trim;
                q(clone);
                return clone;
            }
            return r2;
        }
        Tag tag = new Tag(trim, str2, str3);
        q(tag);
        return tag;
    }

    public Tag x(String str, String str2, ParseSettings parseSettings) {
        return w(str, null, str2, parseSettings.f());
    }

    public TagSet(TagSet tagSet) {
        this.a = new HashMap();
        this.b = tagSet;
    }
}
