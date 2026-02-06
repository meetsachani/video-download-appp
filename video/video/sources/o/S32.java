package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.AbstractC9885u32;
import o.L32;
import o.R32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class S32 extends AbstractC9885u32<S32, a> implements J32 {
    @Nullable
    public final String b1;
    @Nullable
    public final String c1;
    @Nullable
    public final L32 d1;
    @Nullable
    public final R32 e1;
    @NotNull
    public static final c f1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<S32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9885u32.a<S32, a> {
        @Nullable
        public String g;
        @Nullable
        public String h;
        @Nullable
        public L32 i;
        @Nullable
        public R32 j;

        @NotNull
        public final a A(@Nullable String str) {
            this.g = str;
            return this;
        }

        public final void B(@Nullable String str) {
            this.g = str;
        }

        @NotNull
        public final a C(@Nullable String str) {
            this.h = str;
            return this;
        }

        public final void D(@Nullable String str) {
            this.h = str;
        }

        @NotNull
        public final a E(@Nullable L32 l32) {
            L32 build;
            if (l32 == null) {
                build = null;
            } else {
                build = new L32.a().c(l32).build();
            }
            this.i = build;
            return this;
        }

        public final void F(@Nullable L32 l32) {
            this.i = l32;
        }

        @NotNull
        public final a G(@Nullable R32 r32) {
            if (r32 == null) {
                return this;
            }
            this.j = new R32.a().c(r32).build();
            return this;
        }

        public final void H(@Nullable R32 r32) {
            this.j = r32;
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: u */
        public S32 build() {
            return new S32(this, null);
        }

        @Nullable
        public final String v() {
            return this.g;
        }

        @Nullable
        public final String w() {
            return this.h;
        }

        @Nullable
        public final L32 x() {
            return this.i;
        }

        @Nullable
        public final R32 y() {
            return this.j;
        }

        @Override // o.AbstractC9885u32.a
        @NotNull
        /* renamed from: z */
        public a h(@Nullable S32 s32) {
            if (s32 == null) {
                return this;
            }
            return ((a) super.a(s32)).A(s32.h()).C(s32.k()).E(s32.m()).G(s32.n());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<S32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public S32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new S32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public S32[] newArray(int i) {
            return new S32[i];
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ S32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String h() {
        return this.b1;
    }

    @Nullable
    public final String k() {
        return this.c1;
    }

    @Nullable
    public final L32 m() {
        return this.d1;
    }

    @Nullable
    public final R32 n() {
        return this.e1;
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b1);
        parcel.writeString(this.c1);
        parcel.writeParcelable(this.d1, 0);
        parcel.writeParcelable(this.e1, 0);
    }

    public S32(a aVar) {
        super(aVar);
        this.b1 = aVar.v();
        this.c1 = aVar.w();
        this.d1 = aVar.x();
        this.e1 = aVar.y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.b1 = parcel.readString();
        this.c1 = parcel.readString();
        L32.a o2 = new L32.a().o(parcel);
        this.d1 = (o2.l() == null && o2.j() == null) ? null : o2.build();
        this.e1 = new R32.a().l(parcel).build();
    }
}
