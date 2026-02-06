package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.AbstractC9885u32;
import o.C4175Rw;
import o.C4469Uw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.r32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9156r32 extends AbstractC9885u32<C9156r32, a> {
    @Nullable
    public String b1;
    @Nullable
    public C4175Rw c1;
    @Nullable
    public C4469Uw d1;
    @NotNull
    public static final c e1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C9156r32> CREATOR = new b();

    /* renamed from: o.r32$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9885u32.a<C9156r32, a> {
        @Nullable
        public String g;
        @Nullable
        public C4175Rw h;
        @Nullable
        public C4469Uw i;

        public final void A(@Nullable C4175Rw c4175Rw) {
            this.h = c4175Rw;
        }

        @NotNull
        public final a B(@Nullable String str) {
            this.g = str;
            return this;
        }

        public final void C(@Nullable String str) {
            this.g = str;
        }

        @NotNull
        public final a D(@Nullable C4469Uw c4469Uw) {
            this.i = c4469Uw;
            return this;
        }

        public final void E(@Nullable C4469Uw c4469Uw) {
            this.i = c4469Uw;
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: u */
        public C9156r32 build() {
            return new C9156r32(this, null);
        }

        @Nullable
        public final C4175Rw v() {
            return this.h;
        }

        @Nullable
        public final String w() {
            return this.g;
        }

        @Nullable
        public final C4469Uw x() {
            return this.i;
        }

        @Override // o.AbstractC9885u32.a
        @NotNull
        /* renamed from: y */
        public a h(@Nullable C9156r32 c9156r32) {
            if (c9156r32 == null) {
                return this;
            }
            return ((a) super.a(c9156r32)).B(c9156r32.k()).z(c9156r32.h()).D(c9156r32.m());
        }

        @NotNull
        public final a z(@Nullable C4175Rw c4175Rw) {
            this.h = c4175Rw;
            return this;
        }
    }

    /* renamed from: o.r32$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<C9156r32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C9156r32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C9156r32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C9156r32[] newArray(int i) {
            return new C9156r32[i];
        }
    }

    /* renamed from: o.r32$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ C9156r32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Nullable
    public final C4175Rw h() {
        return this.c1;
    }

    @Nullable
    public final String k() {
        return this.b1;
    }

    @Nullable
    public final C4469Uw m() {
        return this.d1;
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b1);
        parcel.writeParcelable(this.c1, 0);
        parcel.writeParcelable(this.d1, 0);
    }

    public C9156r32(a aVar) {
        super(aVar);
        this.b1 = aVar.w();
        this.c1 = aVar.v();
        this.d1 = aVar.x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9156r32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.b1 = parcel.readString();
        this.c1 = new C4175Rw.a().f(parcel).build();
        this.d1 = new C4469Uw.a().g(parcel).build();
    }
}
