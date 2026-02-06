package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.AbstractC9885u32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.z32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11103z32 extends AbstractC9885u32<C11103z32, a> {
    @Nullable
    public final String b1;
    @Nullable
    public final String c1;
    @Nullable
    public final String d1;
    @Nullable
    public final String e1;
    @Nullable
    public final String f1;
    @Nullable
    public final String g1;
    @Nullable
    public final String h1;
    @NotNull
    public static final c i1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C11103z32> CREATOR = new b();

    /* renamed from: o.z32$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9885u32.a<C11103z32, a> {
        @Nullable
        public String g;
        @Nullable
        public String h;
        @Nullable
        public String i;
        @Nullable
        public String j;
        @Nullable
        public String k;
        @Nullable
        public String l;
        @Nullable
        public String m;

        @Nullable
        public final String A() {
            return this.l;
        }

        @Nullable
        public final String B() {
            return this.g;
        }

        @Override // o.AbstractC9885u32.a
        @NotNull
        /* renamed from: C */
        public a h(@Nullable C11103z32 c11103z32) {
            if (c11103z32 == null) {
                return this;
            }
            return ((a) super.a(c11103z32)).P(c11103z32.s()).D(c11103z32.h()).J(c11103z32.n()).F(c11103z32.k()).H(c11103z32.m()).N(c11103z32.q()).L(c11103z32.o());
        }

        @NotNull
        public final a D(@Nullable String str) {
            this.h = str;
            return this;
        }

        public final void E(@Nullable String str) {
            this.h = str;
        }

        @NotNull
        public final a F(@Nullable String str) {
            this.j = str;
            return this;
        }

        public final void G(@Nullable String str) {
            this.j = str;
        }

        @NotNull
        public final a H(@Nullable String str) {
            this.k = str;
            return this;
        }

        public final void I(@Nullable String str) {
            this.k = str;
        }

        @NotNull
        public final a J(@Nullable String str) {
            this.i = str;
            return this;
        }

        public final void K(@Nullable String str) {
            this.i = str;
        }

        @NotNull
        public final a L(@Nullable String str) {
            this.m = str;
            return this;
        }

        public final void M(@Nullable String str) {
            this.m = str;
        }

        @NotNull
        public final a N(@Nullable String str) {
            this.l = str;
            return this;
        }

        public final void O(@Nullable String str) {
            this.l = str;
        }

        @NotNull
        public final a P(@Nullable String str) {
            this.g = str;
            return this;
        }

        public final void Q(@Nullable String str) {
            this.g = str;
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: u */
        public C11103z32 build() {
            return new C11103z32(this, null);
        }

        @Nullable
        public final String v() {
            return this.h;
        }

        @Nullable
        public final String w() {
            return this.j;
        }

        @Nullable
        public final String x() {
            return this.k;
        }

        @Nullable
        public final String y() {
            return this.i;
        }

        @Nullable
        public final String z() {
            return this.m;
        }
    }

    /* renamed from: o.z32$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<C11103z32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C11103z32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C11103z32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C11103z32[] newArray(int i) {
            return new C11103z32[i];
        }
    }

    /* renamed from: o.z32$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ C11103z32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String h() {
        return this.c1;
    }

    @Nullable
    public final String k() {
        return this.e1;
    }

    @Nullable
    public final String m() {
        return this.f1;
    }

    @Nullable
    public final String n() {
        return this.d1;
    }

    @Nullable
    public final String o() {
        return this.h1;
    }

    @Nullable
    public final String q() {
        return this.g1;
    }

    @Nullable
    public final String s() {
        return this.b1;
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b1);
        parcel.writeString(this.c1);
        parcel.writeString(this.d1);
        parcel.writeString(this.e1);
        parcel.writeString(this.f1);
        parcel.writeString(this.g1);
        parcel.writeString(this.h1);
    }

    public C11103z32(a aVar) {
        super(aVar);
        this.b1 = aVar.B();
        this.c1 = aVar.v();
        this.d1 = aVar.y();
        this.e1 = aVar.w();
        this.f1 = aVar.x();
        this.g1 = aVar.A();
        this.h1 = aVar.z();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11103z32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.b1 = parcel.readString();
        this.c1 = parcel.readString();
        this.d1 = parcel.readString();
        this.e1 = parcel.readString();
        this.f1 = parcel.readString();
        this.g1 = parcel.readString();
        this.h1 = parcel.readString();
    }
}
