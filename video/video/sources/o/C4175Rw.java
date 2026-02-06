package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Rw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4175Rw implements J32 {
    @Nullable
    public final Bundle X;
    @NotNull
    public static final c Y = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C4175Rw> CREATOR = new b();

    /* renamed from: o.Rw$a */
    /* loaded from: classes2.dex */
    public static final class a implements K32<C4175Rw, a> {
        @NotNull
        public final Bundle a = new Bundle();

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public C4175Rw build() {
            return new C4175Rw(this, null);
        }

        @NotNull
        public final Bundle c() {
            return this.a;
        }

        @NotNull
        public final a d(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "key");
            C6562gT0.p(str2, "value");
            this.a.putString(str, str2);
            return this;
        }

        @NotNull
        public final a e(@NotNull String str, @NotNull String[] strArr) {
            C6562gT0.p(str, "key");
            C6562gT0.p(strArr, "arrayValue");
            this.a.putStringArray(str, strArr);
            return this;
        }

        @NotNull
        public final a f(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((C4175Rw) parcel.readParcelable(C4175Rw.class.getClassLoader()));
        }

        @Override // o.K32
        @NotNull
        /* renamed from: g */
        public a a(@Nullable C4175Rw c4175Rw) {
            if (c4175Rw != null) {
                this.a.putAll(c4175Rw.X);
            }
            return this;
        }
    }

    /* renamed from: o.Rw$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<C4175Rw> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C4175Rw createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C4175Rw(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C4175Rw[] newArray(int i) {
            return new C4175Rw[i];
        }
    }

    /* renamed from: o.Rw$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ C4175Rw(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Nullable
    public final Object b(@Nullable String str) {
        Bundle bundle = this.X;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    @Nullable
    public final String c(@Nullable String str) {
        Bundle bundle = this.X;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    @Nullable
    public final String[] d(@Nullable String str) {
        Bundle bundle = this.X;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArray(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Set<String> e() {
        Set<String> keySet;
        Bundle bundle = this.X;
        if (bundle == null) {
            keySet = null;
        } else {
            keySet = bundle.keySet();
        }
        if (keySet == null) {
            return B22.k();
        }
        return keySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        parcel.writeBundle(this.X);
    }

    public C4175Rw(a aVar) {
        this.X = aVar.c();
    }

    public C4175Rw(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readBundle(C4175Rw.class.getClassLoader());
    }
}
