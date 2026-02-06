package o;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;

/* renamed from: o.bK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5303bK2 {
    public final List<C5060aK2> a;
    public final Uri b;
    public final InputEvent c;
    public final Uri d;
    public final Uri e;
    public final Uri f;

    /* renamed from: o.bK2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final List<C5060aK2> a;
        public final Uri b;
        public InputEvent c;
        public Uri d;
        public Uri e;
        public Uri f;

        public a(List<C5060aK2> list, Uri uri) {
            C6562gT0.p(list, "webSourceParams");
            C6562gT0.p(uri, "topOriginUri");
            this.a = list;
            this.b = uri;
        }

        public final C5303bK2 a() {
            return new C5303bK2(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public final a b(Uri uri) {
            this.d = uri;
            return this;
        }

        public final a c(InputEvent inputEvent) {
            C6562gT0.p(inputEvent, "inputEvent");
            this.c = inputEvent;
            return this;
        }

        public final a d(Uri uri) {
            this.f = uri;
            return this;
        }

        public final a e(Uri uri) {
            this.e = uri;
            return this;
        }
    }

    public C5303bK2(List<C5060aK2> list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4) {
        C6562gT0.p(list, "webSourceParams");
        C6562gT0.p(uri, "topOriginUri");
        this.a = list;
        this.b = uri;
        this.c = inputEvent;
        this.d = uri2;
        this.e = uri3;
        this.f = uri4;
    }

    public final Uri a() {
        return this.d;
    }

    public final InputEvent b() {
        return this.c;
    }

    public final Uri c() {
        return this.b;
    }

    public final Uri d() {
        return this.f;
    }

    public final Uri e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5303bK2)) {
            return false;
        }
        C5303bK2 c5303bK2 = (C5303bK2) obj;
        if (C6562gT0.g(this.a, c5303bK2.a) && C6562gT0.g(this.e, c5303bK2.e) && C6562gT0.g(this.d, c5303bK2.d) && C6562gT0.g(this.b, c5303bK2.b) && C6562gT0.g(this.c, c5303bK2.c) && C6562gT0.g(this.f, c5303bK2.f)) {
            return true;
        }
        return false;
    }

    public final List<C5060aK2> f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        InputEvent inputEvent = this.c;
        if (inputEvent != null) {
            hashCode = (hashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.d;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.e;
        if (uri2 != null) {
            hashCode = (hashCode * 31) + uri2.hashCode();
        }
        int hashCode2 = (hashCode * 31) + this.b.hashCode();
        InputEvent inputEvent2 = this.c;
        if (inputEvent2 != null) {
            hashCode2 = (hashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.f;
        if (uri3 != null) {
            return (hashCode2 * 31) + uri3.hashCode();
        }
        return hashCode2;
    }

    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.a + "], TopOriginUri=" + this.b + ", InputEvent=" + this.c + ", AppDestination=" + this.d + ", WebDestination=" + this.e + ", VerifiedDestination=" + this.f) + " }";
    }

    public /* synthetic */ C5303bK2(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i, C9516sY c9516sY) {
        this(list, uri, (i & 4) != 0 ? null : inputEvent, (i & 8) != 0 ? null : uri2, (i & 16) != 0 ? null : uri3, (i & 32) != 0 ? null : uri4);
    }
}
