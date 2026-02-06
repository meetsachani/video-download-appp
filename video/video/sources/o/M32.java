package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC9885u32;
import o.L32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class M32 extends AbstractC9885u32<M32, a> {
    @NotNull
    public final List<L32> b1;
    @NotNull
    public static final c c1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<M32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9885u32.a<M32, a> {
        @NotNull
        public final List<L32> g = new ArrayList();

        @NotNull
        public final a u(@Nullable L32 l32) {
            if (l32 != null) {
                this.g.add(new L32.a().c(l32).build());
            }
            return this;
        }

        @NotNull
        public final a v(@Nullable List<L32> list) {
            if (list != null) {
                for (L32 l32 : list) {
                    u(l32);
                }
            }
            return this;
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: w */
        public M32 build() {
            return new M32(this, null);
        }

        @NotNull
        public final List<L32> x() {
            return this.g;
        }

        @Override // o.AbstractC9885u32.a
        @NotNull
        /* renamed from: y */
        public a h(@Nullable M32 m32) {
            if (m32 == null) {
                return this;
            }
            return ((a) super.a(m32)).v(m32.h());
        }

        @NotNull
        public final a z(@Nullable List<L32> list) {
            this.g.clear();
            v(list);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<M32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public M32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new M32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public M32[] newArray(int i) {
            return new M32[i];
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

    public /* synthetic */ M32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<L32> h() {
        return this.b1;
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        L32.a.g.b(parcel, i, this.b1);
    }

    public M32(a aVar) {
        super(aVar);
        this.b1 = C10662xF.Y5(aVar.x());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.b1 = C10662xF.Y5(L32.a.g.a(parcel));
    }
}
