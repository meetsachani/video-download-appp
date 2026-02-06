package o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Uw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4469Uw implements J32 {
    @Nullable
    public final Bundle X;
    @NotNull
    public static final c Y = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C4469Uw> CREATOR = new b();

    /* renamed from: o.Uw$a */
    /* loaded from: classes2.dex */
    public static final class a implements K32<C4469Uw, a> {
        @NotNull
        public final Bundle a = new Bundle();

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public C4469Uw build() {
            return new C4469Uw(this, null);
        }

        @NotNull
        public final Bundle c() {
            return this.a;
        }

        public final a d(String str, Parcelable parcelable) {
            if (str.length() > 0 && parcelable != null) {
                this.a.putParcelable(str, parcelable);
            }
            return this;
        }

        @NotNull
        public final a e(@NotNull String str, @Nullable Bitmap bitmap) {
            C6562gT0.p(str, "key");
            return d(str, bitmap);
        }

        @NotNull
        public final a f(@NotNull String str, @Nullable Uri uri) {
            C6562gT0.p(str, "key");
            return d(str, uri);
        }

        @NotNull
        public final a g(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((C4469Uw) parcel.readParcelable(C4469Uw.class.getClassLoader()));
        }

        @Override // o.K32
        @NotNull
        /* renamed from: h */
        public a a(@Nullable C4469Uw c4469Uw) {
            if (c4469Uw != null) {
                this.a.putAll(c4469Uw.X);
            }
            return this;
        }
    }

    /* renamed from: o.Uw$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<C4469Uw> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C4469Uw createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C4469Uw(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C4469Uw[] newArray(int i) {
            return new C4469Uw[i];
        }
    }

    /* renamed from: o.Uw$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ C4469Uw(a aVar, C9516sY c9516sY) {
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
    public final Bitmap c(@Nullable String str) {
        Object obj;
        Bundle bundle = this.X;
        if (bundle == null) {
            obj = null;
        } else {
            obj = bundle.get(str);
        }
        if (!(obj instanceof Bitmap)) {
            return null;
        }
        return (Bitmap) obj;
    }

    @Nullable
    public final Uri d(@Nullable String str) {
        Object obj;
        Bundle bundle = this.X;
        if (bundle == null) {
            obj = null;
        } else {
            obj = bundle.get(str);
        }
        if (!(obj instanceof Uri)) {
            return null;
        }
        return (Uri) obj;
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

    public C4469Uw(a aVar) {
        this.X = aVar.c();
    }

    public C4469Uw(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readBundle(C4469Uw.class.getClassLoader());
    }
}
