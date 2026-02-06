package o;

import android.net.Uri;
import java.time.Instant;
import java.util.List;

/* loaded from: classes.dex */
public final class CS {
    public final C7686l7 a;
    public final String b;
    public final Uri c;
    public final Uri d;
    public final List<C10137v6> e;
    public final Instant f;
    public final Instant g;
    public final C7200j7 h;
    public final Hu2 i;

    /* loaded from: classes.dex */
    public static final class a {
        public C7686l7 a;
        public String b;
        public Uri c;
        public Uri d;
        public List<C10137v6> e;
        public Instant f;
        public Instant g;
        public C7200j7 h;
        public Hu2 i;

        public a(C7686l7 c7686l7, String str, Uri uri, Uri uri2, List<C10137v6> list) {
            C6562gT0.p(c7686l7, "buyer");
            C6562gT0.p(str, "name");
            C6562gT0.p(uri, "dailyUpdateUri");
            C6562gT0.p(uri2, "biddingLogicUri");
            C6562gT0.p(list, "ads");
            this.a = c7686l7;
            this.b = str;
            this.c = uri;
            this.d = uri2;
            this.e = list;
        }

        public final CS a() {
            return new CS(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final a b(Instant instant) {
            C6562gT0.p(instant, "activationTime");
            this.f = instant;
            return this;
        }

        public final a c(List<C10137v6> list) {
            C6562gT0.p(list, "ads");
            this.e = list;
            return this;
        }

        public final a d(Uri uri) {
            C6562gT0.p(uri, "biddingLogicUri");
            this.d = uri;
            return this;
        }

        public final a e(C7686l7 c7686l7) {
            C6562gT0.p(c7686l7, "buyer");
            this.a = c7686l7;
            return this;
        }

        public final a f(Uri uri) {
            C6562gT0.p(uri, "dailyUpdateUri");
            this.c = uri;
            return this;
        }

        public final a g(Instant instant) {
            C6562gT0.p(instant, C9998uW1.t);
            this.g = instant;
            return this;
        }

        public final a h(String str) {
            C6562gT0.p(str, "name");
            this.b = str;
            return this;
        }

        public final a i(Hu2 hu2) {
            C6562gT0.p(hu2, "trustedBiddingSignals");
            this.i = hu2;
            return this;
        }

        public final a j(C7200j7 c7200j7) {
            C6562gT0.p(c7200j7, "userBiddingSignals");
            this.h = c7200j7;
            return this;
        }
    }

    public CS(C7686l7 c7686l7, String str, Uri uri, Uri uri2, List<C10137v6> list, Instant instant, Instant instant2, C7200j7 c7200j7, Hu2 hu2) {
        C6562gT0.p(c7686l7, "buyer");
        C6562gT0.p(str, "name");
        C6562gT0.p(uri, "dailyUpdateUri");
        C6562gT0.p(uri2, "biddingLogicUri");
        C6562gT0.p(list, "ads");
        this.a = c7686l7;
        this.b = str;
        this.c = uri;
        this.d = uri2;
        this.e = list;
        this.f = instant;
        this.g = instant2;
        this.h = c7200j7;
        this.i = hu2;
    }

    public final Instant a() {
        return this.f;
    }

    public final List<C10137v6> b() {
        return this.e;
    }

    public final Uri c() {
        return this.d;
    }

    public final C7686l7 d() {
        return this.a;
    }

    public final Uri e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CS)) {
            return false;
        }
        CS cs = (CS) obj;
        if (C6562gT0.g(this.a, cs.a) && C6562gT0.g(this.b, cs.b) && C6562gT0.g(this.f, cs.f) && C6562gT0.g(this.g, cs.g) && C6562gT0.g(this.c, cs.c) && C6562gT0.g(this.h, cs.h) && C6562gT0.g(this.i, cs.i) && C6562gT0.g(this.e, cs.e)) {
            return true;
        }
        return false;
    }

    public final Instant f() {
        return this.g;
    }

    public final String g() {
        return this.b;
    }

    public final Hu2 h() {
        return this.i;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Instant instant = this.f;
        int i4 = 0;
        if (instant != null) {
            i = instant.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        Instant instant2 = this.g;
        if (instant2 != null) {
            i2 = instant2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((i5 + i2) * 31) + this.c.hashCode()) * 31;
        C7200j7 c7200j7 = this.h;
        if (c7200j7 != null) {
            i3 = c7200j7.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (hashCode2 + i3) * 31;
        Hu2 hu2 = this.i;
        if (hu2 != null) {
            i4 = hu2.hashCode();
        }
        return ((((i6 + i4) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final C7200j7 i() {
        return this.h;
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.d + ", activationTime=" + this.f + ", expirationTime=" + this.g + ", dailyUpdateUri=" + this.c + ", userBiddingSignals=" + this.h + ", trustedBiddingSignals=" + this.i + ", biddingLogicUri=" + this.d + ", ads=" + this.e;
    }

    public /* synthetic */ CS(C7686l7 c7686l7, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, C7200j7 c7200j7, Hu2 hu2, int i, C9516sY c9516sY) {
        this(c7686l7, str, uri, uri2, list, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? null : c7200j7, (i & 256) != 0 ? null : hu2);
    }
}
