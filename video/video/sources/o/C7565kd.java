package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.kd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7565kd implements J32 {
    @Nullable
    public final String X;
    @Nullable
    public final String Y;
    @Nullable
    public final a Z;
    @NotNull
    public static final d Y0 = new d(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C7565kd> CREATOR = new c();

    /* renamed from: o.kd$a */
    /* loaded from: classes2.dex */
    public enum a {
        Open,
        Closed;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: o.kd$b */
    /* loaded from: classes2.dex */
    public static final class b implements K32<C7565kd, b> {
        @Nullable
        public String a;
        @Nullable
        public String b;
        @Nullable
        public a c;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public C7565kd build() {
            return new C7565kd(this, null);
        }

        @Nullable
        public final a c() {
            return this.c;
        }

        @Nullable
        public final String d() {
            return this.b;
        }

        @Nullable
        public final String e() {
            return this.a;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: f */
        public b a(@Nullable C7565kd c7565kd) {
            if (c7565kd == null) {
                return this;
            }
            return k(c7565kd.c()).i(c7565kd.b()).g(c7565kd.a());
        }

        @NotNull
        public final b g(@Nullable a aVar) {
            this.c = aVar;
            return this;
        }

        public final void h(@Nullable a aVar) {
            this.c = aVar;
        }

        @NotNull
        public final b i(@Nullable String str) {
            this.b = str;
            return this;
        }

        public final void j(@Nullable String str) {
            this.b = str;
        }

        @NotNull
        public final b k(@Nullable String str) {
            this.a = str;
            return this;
        }

        public final void l(@Nullable String str) {
            this.a = str;
        }
    }

    /* renamed from: o.kd$c */
    /* loaded from: classes2.dex */
    public static final class c implements Parcelable.Creator<C7565kd> {
        @Override // android.os.Parcelable.Creator
        @Nullable
        /* renamed from: a */
        public C7565kd createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C7565kd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C7565kd[] newArray(int i) {
            return new C7565kd[i];
        }
    }

    /* renamed from: o.kd$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C9516sY c9516sY) {
            this();
        }

        public d() {
        }
    }

    public /* synthetic */ C7565kd(b bVar, C9516sY c9516sY) {
        this(bVar);
    }

    @Nullable
    public final a a() {
        return this.Z;
    }

    @Nullable
    public final String b() {
        return this.Y;
    }

    @Nullable
    public final String c() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeSerializable(this.Z);
    }

    public C7565kd(b bVar) {
        this.X = bVar.e();
        this.Y = bVar.d();
        this.Z = bVar.c();
    }

    public C7565kd(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = (a) parcel.readSerializable();
    }
}
