package o;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AM implements J32 {
    @NotNull
    public static final b CREATOR = new b(null);
    @Nullable
    public final String X;

    /* loaded from: classes2.dex */
    public static final class a implements K32<AM, a> {
        @Nullable
        public String a;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public AM build() {
            return new AM(this, null);
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        @NotNull
        public final a d(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((AM) parcel.readParcelable(AM.class.getClassLoader()));
        }

        @Override // o.K32
        @NotNull
        /* renamed from: e */
        public a a(@Nullable AM am) {
            a f;
            if (am == null || (f = f(am.a())) == null) {
                return this;
            }
            return f;
        }

        @NotNull
        public final a f(@Nullable String str) {
            this.a = str;
            return this;
        }

        public final void g(@Nullable String str) {
            this.a = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<AM> {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public AM createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new AM(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public AM[] newArray(int i) {
            return new AM[i];
        }

        public b() {
        }
    }

    public /* synthetic */ AM(a aVar, C9516sY c9516sY) {
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
        C6562gT0.p(parcel, "out");
        parcel.writeString(this.X);
    }

    public AM(a aVar) {
        this.X = aVar.c();
    }

    public AM(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readString();
    }
}
