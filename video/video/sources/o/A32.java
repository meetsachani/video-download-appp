package o;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class A32 implements J32 {
    @Nullable
    public final String X;
    @NotNull
    public static final c Y = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<A32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a implements K32<A32, a> {
        @Nullable
        public String a;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public A32 build() {
            return new A32(this, null);
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: d */
        public a a(@Nullable A32 a32) {
            if (a32 == null) {
                return this;
            }
            return f(a32.a());
        }

        @NotNull
        public final a e(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((A32) parcel.readParcelable(A32.class.getClassLoader()));
        }

        @NotNull
        public final a f(@Nullable String str) {
            this.a = str;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<A32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public A32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new A32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public A32[] newArray(int i) {
            return new A32[i];
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

    public /* synthetic */ A32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Nullable
    public final String a() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeString(this.X);
    }

    public A32(a aVar) {
        this.X = aVar.c();
    }

    public A32(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readString();
    }
}
