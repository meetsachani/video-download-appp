package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC9885u32;
import o.L32;
import o.R32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class G32 extends AbstractC9885u32<G32, a> {
    @NotNull
    public final List<F32<?, ?>> b1;
    @NotNull
    public static final c c1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<G32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9885u32.a<G32, a> {
        @NotNull
        public final List<F32<?, ?>> g = new ArrayList();

        @NotNull
        public final a u(@Nullable List<? extends F32<?, ?>> list) {
            if (list != null) {
                for (F32<?, ?> f32 : list) {
                    v(f32);
                }
            }
            return this;
        }

        @NotNull
        public final a v(@Nullable F32<?, ?> f32) {
            F32<?, ?> build;
            if (f32 != null) {
                if (f32 instanceof L32) {
                    build = new L32.a().c((L32) f32).build();
                } else if (f32 instanceof R32) {
                    build = new R32.a().c((R32) f32).build();
                } else {
                    throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
                }
                this.g.add(build);
                return this;
            }
            return this;
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: w */
        public G32 build() {
            return new G32(this, null);
        }

        @NotNull
        public final List<F32<?, ?>> x() {
            return this.g;
        }

        @Override // o.AbstractC9885u32.a
        @NotNull
        /* renamed from: y */
        public a h(@Nullable G32 g32) {
            if (g32 == null) {
                return this;
            }
            return ((a) super.a(g32)).u(g32.h());
        }

        @NotNull
        public final a z(@Nullable List<? extends F32<?, ?>> list) {
            this.g.clear();
            u(list);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<G32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public G32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new G32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public G32[] newArray(int i) {
            return new G32[i];
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

    public /* synthetic */ G32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<F32<?, ?>> h() {
        return this.b1;
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        Object[] array = this.b1.toArray(new F32[0]);
        if (array != null) {
            parcel.writeParcelableArray((Parcelable[]) array, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public G32(a aVar) {
        super(aVar);
        this.b1 = C10662xF.Y5(aVar.x());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G32(@NotNull Parcel parcel) {
        super(parcel);
        List list;
        C6562gT0.p(parcel, "source");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(F32.class.getClassLoader());
        if (readParcelableArray == null) {
            list = null;
        } else {
            List arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                F32 f32 = (F32) parcelable;
                if (f32 != null) {
                    arrayList.add(f32);
                }
            }
            list = arrayList;
        }
        this.b1 = list == null ? C8222nF.H() : list;
    }
}
