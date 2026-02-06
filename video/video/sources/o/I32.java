package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.H32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class I32 extends H32 {
    @Nullable
    public final Uri Y;
    public final boolean Y0;
    @Nullable
    public final Uri Z;
    public final boolean Z0;
    @Nullable
    public final d a1;
    @NotNull
    public static final c b1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<I32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends H32.a<I32, a> {
        @Nullable
        public Uri b;
        public boolean c;
        @Nullable
        public Uri d;
        @Nullable
        public d e;
        public boolean f;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: f */
        public I32 build() {
            return new I32(this, null);
        }

        @Nullable
        public final Uri g() {
            return this.d;
        }

        public final boolean h() {
            return this.f;
        }

        @Nullable
        public final Uri i() {
            return this.b;
        }

        @Nullable
        public final d j() {
            return this.e;
        }

        public final boolean k() {
            return this.c;
        }

        @Override // o.H32.a
        @NotNull
        /* renamed from: l */
        public a c(@Nullable I32 i32) {
            if (i32 == null) {
                return this;
            }
            return s(i32.e()).o(i32.g()).m(i32.b()).u(i32.f()).q(i32.d());
        }

        @NotNull
        public final a m(@Nullable Uri uri) {
            this.d = uri;
            return this;
        }

        public final void n(@Nullable Uri uri) {
            this.d = uri;
        }

        @NotNull
        public final a o(boolean z) {
            this.c = z;
            return this;
        }

        public final void p(boolean z) {
            this.c = z;
        }

        @NotNull
        public final a q(boolean z) {
            this.f = z;
            return this;
        }

        public final void r(boolean z) {
            this.f = z;
        }

        @NotNull
        public final a s(@Nullable Uri uri) {
            this.b = uri;
            return this;
        }

        public final void t(@Nullable Uri uri) {
            this.b = uri;
        }

        @NotNull
        public final a u(@Nullable d dVar) {
            this.e = dVar;
            return this;
        }

        public final void v(@Nullable d dVar) {
            this.e = dVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<I32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public I32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new I32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public I32[] newArray(int i) {
            return new I32[i];
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

    /* loaded from: classes2.dex */
    public enum d {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ I32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Nullable
    public final Uri b() {
        return this.Z;
    }

    @InterfaceC9150r20(message = "getIsMessengerExtensionURL is deprecated. Use isMessengerExtensionURL instead", replaceWith = @IR1(expression = "isMessengerExtensionURL", imports = {}))
    public final boolean c() {
        return this.Y0;
    }

    public final boolean d() {
        return this.Z0;
    }

    @Nullable
    public final Uri e() {
        return this.Y;
    }

    @Nullable
    public final d f() {
        return this.a1;
    }

    public final boolean g() {
        return this.Y0;
    }

    @Override // o.H32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Y, 0);
        parcel.writeByte(this.Y0 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.Z, 0);
        parcel.writeSerializable(this.a1);
        parcel.writeByte(this.Y0 ? (byte) 1 : (byte) 0);
    }

    public I32(a aVar) {
        super(aVar);
        this.Y = aVar.i();
        this.Y0 = aVar.k();
        this.Z = aVar.g();
        this.a1 = aVar.j();
        this.Z0 = aVar.h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.Y = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.Y0 = parcel.readByte() != 0;
        this.Z = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.a1 = (d) parcel.readSerializable();
        this.Z0 = parcel.readByte() != 0;
    }
}
