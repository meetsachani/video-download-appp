package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import o.F32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class R32 extends F32<R32, a> {
    @Nullable
    public final Uri Y;
    @NotNull
    public final F32.b Z;
    @NotNull
    public static final c Y0 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<R32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends F32.a<R32, a> {
        @Nullable
        public Uri c;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: i */
        public R32 build() {
            return new R32(this, null);
        }

        @Nullable
        public final Uri j() {
            return this.c;
        }

        @Override // o.F32.a
        @NotNull
        /* renamed from: k */
        public a c(@Nullable R32 r32) {
            if (r32 == null) {
                return this;
            }
            return m(r32.d());
        }

        @NotNull
        public final a l(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return c((R32) parcel.readParcelable(R32.class.getClassLoader()));
        }

        @NotNull
        public final a m(@Nullable Uri uri) {
            this.c = uri;
            return this;
        }

        public final void n(@Nullable Uri uri) {
            this.c = uri;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<R32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public R32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new R32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public R32[] newArray(int i) {
            return new R32[i];
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

    public /* synthetic */ R32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.F32
    @NotNull
    public F32.b b() {
        return this.Z;
    }

    @Nullable
    public final Uri d() {
        return this.Y;
    }

    @Override // o.F32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // o.F32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Y, 0);
    }

    public R32(a aVar) {
        super(aVar);
        this.Z = F32.b.VIDEO;
        this.Y = aVar.j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.Z = F32.b.VIDEO;
        this.Y = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
