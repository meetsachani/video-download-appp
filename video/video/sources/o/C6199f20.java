package o;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;

/* renamed from: o.f20  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6199f20 {
    public static final b g = new b(null);
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 0;
    public static final int k = 1;
    public final int a;
    public final int b;
    public final Instant c;
    public final Instant d;
    public final List<Uri> e;
    public final List<Uri> f;

    /* renamed from: o.f20$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public Instant c;
        public Instant d;
        public List<? extends Uri> e;
        public List<? extends Uri> f;

        public a(int i, int i2) {
            Instant instant;
            Instant instant2;
            this.a = i;
            this.b = i2;
            instant = Instant.MIN;
            C6562gT0.o(instant, "MIN");
            this.c = instant;
            instant2 = Instant.MAX;
            C6562gT0.o(instant2, "MAX");
            this.d = instant2;
            this.e = C8222nF.H();
            this.f = C8222nF.H();
        }

        public final C6199f20 a() {
            return new C6199f20(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public final a b(List<? extends Uri> list) {
            C6562gT0.p(list, "domainUris");
            this.e = list;
            return this;
        }

        public final a c(Instant instant) {
            C6562gT0.p(instant, "end");
            this.d = instant;
            return this;
        }

        public final a d(List<? extends Uri> list) {
            C6562gT0.p(list, "originUris");
            this.f = list;
            return this;
        }

        public final a e(Instant instant) {
            C6562gT0.p(instant, "start");
            this.c = instant;
            return this;
        }
    }

    /* renamed from: o.f20$b */
    /* loaded from: classes.dex */
    public static final class b {

        @Retention(RetentionPolicy.SOURCE)
        @InterfaceC7780lU1(EnumC7796la.X)
        /* renamed from: o.f20$b$a */
        /* loaded from: classes.dex */
        public @interface a {
        }

        @Retention(RetentionPolicy.SOURCE)
        @InterfaceC7780lU1(EnumC7796la.X)
        /* renamed from: o.f20$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0275b {
        }

        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6199f20(int i2, int i3, Instant instant, Instant instant2, List<? extends Uri> list, List<? extends Uri> list2) {
        C6562gT0.p(instant, "start");
        C6562gT0.p(instant2, "end");
        C6562gT0.p(list, "domainUris");
        C6562gT0.p(list2, "originUris");
        this.a = i2;
        this.b = i3;
        this.c = instant;
        this.d = instant2;
        this.e = list;
        this.f = list2;
    }

    public final int a() {
        return this.a;
    }

    public final List<Uri> b() {
        return this.e;
    }

    public final Instant c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    public final List<Uri> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6199f20)) {
            return false;
        }
        C6199f20 c6199f20 = (C6199f20) obj;
        if (this.a == c6199f20.a && C6562gT0.g(new HashSet(this.e), new HashSet(c6199f20.e)) && C6562gT0.g(new HashSet(this.f), new HashSet(c6199f20.f)) && C6562gT0.g(this.c, c6199f20.c) && C6562gT0.g(this.d, c6199f20.d) && this.b == c6199f20.b) {
            return true;
        }
        return false;
    }

    public final Instant f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        hashCode = this.c.hashCode();
        hashCode2 = this.d.hashCode();
        return (((((((((Integer.hashCode(this.a) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + hashCode) * 31) + hashCode2) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        String str;
        String str2;
        if (this.a == 0) {
            str = "DELETION_MODE_ALL";
        } else {
            str = "DELETION_MODE_EXCLUDE_INTERNAL_DATA";
        }
        if (this.b == 0) {
            str2 = "MATCH_BEHAVIOR_DELETE";
        } else {
            str2 = "MATCH_BEHAVIOR_PRESERVE";
        }
        return "DeletionRequest { DeletionMode=" + str + ", MatchBehavior=" + str2 + ", Start=" + this.c + ", End=" + this.d + ", DomainUris=" + this.e + ", OriginUris=" + this.f + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C6199f20(int i2, int i3, Instant instant, Instant instant2, List list, List list2, int i4, C9516sY c9516sY) {
        this(i2, i3, r3, instant2, (i4 & 16) != 0 ? C8222nF.H() : list, (i4 & 32) != 0 ? C8222nF.H() : list2);
        if ((i4 & 4) != 0) {
            instant = Instant.MIN;
            C6562gT0.o(instant, "MIN");
        }
        Instant instant3 = instant;
        if ((i4 & 8) != 0) {
            instant2 = Instant.MAX;
            C6562gT0.o(instant2, "MAX");
        }
    }
}
