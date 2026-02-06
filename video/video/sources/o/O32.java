package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC9885u32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class O32 extends AbstractC9885u32<O32, a> {
    @Nullable
    public final F32<?, ?> b1;
    @Nullable
    public final L32 c1;
    @Nullable
    public final List<String> d1;
    @Nullable
    public final String e1;
    @NotNull
    public static final c f1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<O32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9885u32.a<O32, a> {
        @Nullable
        public F32<?, ?> g;
        @Nullable
        public L32 h;
        @Nullable
        public List<String> i;
        @Nullable
        public String j;

        @NotNull
        public final a A(@Nullable String str) {
            this.j = str;
            return this;
        }

        public final void B(@Nullable String str) {
            this.j = str;
        }

        @NotNull
        public final a C(@Nullable F32<?, ?> f32) {
            this.g = f32;
            return this;
        }

        public final void D(@Nullable F32<?, ?> f32) {
            this.g = f32;
        }

        @NotNull
        public final a E(@Nullable List<String> list) {
            List<String> Y5;
            if (list == null) {
                Y5 = null;
            } else {
                Y5 = C10662xF.Y5(list);
            }
            this.i = Y5;
            return this;
        }

        public final void F(@Nullable List<String> list) {
            this.i = list;
        }

        @NotNull
        public final a G(@Nullable L32 l32) {
            this.h = l32;
            return this;
        }

        public final void H(@Nullable L32 l32) {
            this.h = l32;
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: u */
        public O32 build() {
            return new O32(this, null);
        }

        @Nullable
        public final String v() {
            return this.j;
        }

        @Nullable
        public final F32<?, ?> w() {
            return this.g;
        }

        @Nullable
        public final List<String> x() {
            return this.i;
        }

        @Nullable
        public final L32 y() {
            return this.h;
        }

        @Override // o.AbstractC9885u32.a
        @NotNull
        /* renamed from: z */
        public a h(@Nullable O32 o32) {
            if (o32 == null) {
                return this;
            }
            return ((a) super.a(o32)).C(o32.k()).G(o32.n()).E(o32.m()).A(o32.h());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<O32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public O32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new O32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public O32[] newArray(int i) {
            return new O32[i];
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

    public /* synthetic */ O32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<String> g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return C10662xF.Y5(arrayList);
    }

    @Nullable
    public final String h() {
        return this.e1;
    }

    @Nullable
    public final F32<?, ?> k() {
        return this.b1;
    }

    @Nullable
    public final List<String> m() {
        List<String> list = this.d1;
        if (list == null) {
            return null;
        }
        return C10662xF.Y5(list);
    }

    @Nullable
    public final L32 n() {
        return this.c1;
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b1, 0);
        parcel.writeParcelable(this.c1, 0);
        parcel.writeStringList(m());
        parcel.writeString(this.e1);
    }

    public O32(a aVar) {
        super(aVar);
        this.b1 = aVar.w();
        this.c1 = aVar.y();
        this.d1 = aVar.x();
        this.e1 = aVar.v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.b1 = (F32) parcel.readParcelable(F32.class.getClassLoader());
        this.c1 = (L32) parcel.readParcelable(L32.class.getClassLoader());
        this.d1 = g(parcel);
        this.e1 = parcel.readString();
    }
}
