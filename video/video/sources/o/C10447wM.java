package o;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.wM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10447wM implements J32 {
    @NotNull
    public static final b CREATOR = new b(null);
    @Nullable
    public final String X;

    /* renamed from: o.wM$a */
    /* loaded from: classes2.dex */
    public static final class a implements K32<C10447wM, a> {
        @Nullable
        public String a;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public C10447wM build() {
            return new C10447wM(this, null);
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        @NotNull
        public final a d(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((C10447wM) parcel.readParcelable(C10447wM.class.getClassLoader()));
        }

        @Override // o.K32
        @NotNull
        /* renamed from: e */
        public a a(@Nullable C10447wM c10447wM) {
            a f;
            if (c10447wM == null || (f = f(c10447wM.a())) == null) {
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

    /* renamed from: o.wM$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<C10447wM> {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C10447wM createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C10447wM(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C10447wM[] newArray(int i) {
            return new C10447wM[i];
        }

        public b() {
        }
    }

    public /* synthetic */ C10447wM(a aVar, C9516sY c9516sY) {
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

    public C10447wM(a aVar) {
        this.X = aVar.c();
    }

    public C10447wM(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readString();
    }
}
