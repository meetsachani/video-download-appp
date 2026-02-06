package o;

import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.A32;
import o.AbstractC9885u32;
import o.AbstractC9885u32.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.u32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9885u32<M extends AbstractC9885u32<M, B>, B extends a<M, B>> implements J32 {
    @Nullable
    public final Uri X;
    @Nullable
    public final List<String> Y;
    @Nullable
    public final String Y0;
    @Nullable
    public final String Z;
    @Nullable
    public final String Z0;
    @Nullable
    public final A32 a1;

    /* renamed from: o.u32$a */
    /* loaded from: classes2.dex */
    public static abstract class a<M extends AbstractC9885u32<M, B>, B extends a<M, B>> implements K32<M, B> {
        @Nullable
        public Uri a;
        @Nullable
        public List<String> b;
        @Nullable
        public String c;
        @Nullable
        public String d;
        @Nullable
        public String e;
        @Nullable
        public A32 f;

        @Nullable
        public final Uri b() {
            return this.a;
        }

        @Nullable
        public final A32 c() {
            return this.f;
        }

        @Nullable
        public final String d() {
            return this.d;
        }

        @Nullable
        public final List<String> e() {
            return this.b;
        }

        @Nullable
        public final String f() {
            return this.c;
        }

        @Nullable
        public final String g() {
            return this.e;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: h */
        public B a(@Nullable M m) {
            if (m == null) {
                return this;
            }
            return (B) i(m.a()).n(m.c()).p(m.d()).l(m.b()).r(m.e()).t(m.f());
        }

        @NotNull
        public final B i(@Nullable Uri uri) {
            this.a = uri;
            return this;
        }

        public final void j(@Nullable Uri uri) {
            this.a = uri;
        }

        public final void k(@Nullable A32 a32) {
            this.f = a32;
        }

        @NotNull
        public final B l(@Nullable String str) {
            this.d = str;
            return this;
        }

        public final void m(@Nullable String str) {
            this.d = str;
        }

        @NotNull
        public final B n(@Nullable List<String> list) {
            List<String> unmodifiableList;
            if (list == null) {
                unmodifiableList = null;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.b = unmodifiableList;
            return this;
        }

        public final void o(@Nullable List<String> list) {
            this.b = list;
        }

        @NotNull
        public final B p(@Nullable String str) {
            this.c = str;
            return this;
        }

        public final void q(@Nullable String str) {
            this.c = str;
        }

        @NotNull
        public final B r(@Nullable String str) {
            this.e = str;
            return this;
        }

        public final void s(@Nullable String str) {
            this.e = str;
        }

        @NotNull
        public final B t(@Nullable A32 a32) {
            this.f = a32;
            return this;
        }
    }

    public AbstractC9885u32(@NotNull a<M, B> aVar) {
        C6562gT0.p(aVar, "builder");
        this.X = aVar.b();
        this.Y = aVar.e();
        this.Z = aVar.f();
        this.Y0 = aVar.d();
        this.Z0 = aVar.g();
        this.a1 = aVar.c();
    }

    private final List<String> g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public final Uri a() {
        return this.X;
    }

    @Nullable
    public final String b() {
        return this.Y0;
    }

    @Nullable
    public final List<String> c() {
        return this.Y;
    }

    @Nullable
    public final String d() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.Z0;
    }

    @Nullable
    public final A32 f() {
        return this.a1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        parcel.writeParcelable(this.X, 0);
        parcel.writeStringList(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeString(this.Z0);
        parcel.writeParcelable(this.a1, 0);
    }

    public AbstractC9885u32(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.Y = g(parcel);
        this.Z = parcel.readString();
        this.Y0 = parcel.readString();
        this.Z0 = parcel.readString();
        this.a1 = new A32.a().e(parcel).build();
    }
}
