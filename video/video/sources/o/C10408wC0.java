package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.wC0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10408wC0 implements J32 {
    @Nullable
    public final String X;
    @Nullable
    public final String Y;
    @Nullable
    public final String Y0;
    @Nullable
    public final List<String> Z;
    @Nullable
    public final String Z0;
    @Nullable
    public final a a1;
    @Nullable
    public final String b1;
    @Nullable
    public final e c1;
    @Nullable
    public final List<String> d1;
    @NotNull
    public static final d e1 = new d(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C10408wC0> CREATOR = new c();

    /* renamed from: o.wC0$a */
    /* loaded from: classes2.dex */
    public enum a {
        SEND,
        ASKFOR,
        TURN,
        INVITE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: o.wC0$b */
    /* loaded from: classes2.dex */
    public static final class b implements K32<C10408wC0, b> {
        @Nullable
        public String a;
        @Nullable
        public String b;
        @Nullable
        public List<String> c;
        @Nullable
        public String d;
        @Nullable
        public String e;
        @Nullable
        public a f;
        @Nullable
        public String g;
        @Nullable
        public e h;
        @Nullable
        public List<String> i;

        public final void A(@Nullable List<String> list) {
            this.c = list;
        }

        @NotNull
        public final b B(@Nullable List<String> list) {
            this.i = list;
            return this;
        }

        public final void C(@Nullable List<String> list) {
            this.i = list;
        }

        @NotNull
        public final b D(@Nullable String str) {
            this.e = str;
            return this;
        }

        public final void E(@Nullable String str) {
            this.e = str;
        }

        @InterfaceC9150r20(message = "Replaced by {@link #setRecipients(List)}")
        @NotNull
        public final b F(@Nullable String str) {
            if (str != null) {
                this.c = C10662xF.Y5(C10763xf2.n5(str, new char[]{','}, false, 0, 6, null));
            }
            return this;
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public C10408wC0 build() {
            return new C10408wC0(this, null);
        }

        @Nullable
        public final a c() {
            return this.f;
        }

        @Nullable
        public final String d() {
            return this.b;
        }

        @Nullable
        public final String e() {
            return this.d;
        }

        @Nullable
        public final e f() {
            return this.h;
        }

        @Nullable
        public final String g() {
            return this.a;
        }

        @Nullable
        public final String h() {
            return this.g;
        }

        @Nullable
        public final List<String> i() {
            return this.c;
        }

        @Nullable
        public final List<String> j() {
            return this.i;
        }

        @Nullable
        public final String k() {
            return this.e;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: l */
        public b a(@Nullable C10408wC0 c10408wC0) {
            if (c10408wC0 == null) {
                return this;
            }
            return v(c10408wC0.e()).p(c10408wC0.b()).z(c10408wC0.g()).D(c10408wC0.k()).r(c10408wC0.c()).n(c10408wC0.a()).x(c10408wC0.f()).t(c10408wC0.d()).B(c10408wC0.h());
        }

        @NotNull
        public final b m(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((C10408wC0) parcel.readParcelable(C10408wC0.class.getClassLoader()));
        }

        @NotNull
        public final b n(@Nullable a aVar) {
            this.f = aVar;
            return this;
        }

        public final void o(@Nullable a aVar) {
            this.f = aVar;
        }

        @NotNull
        public final b p(@Nullable String str) {
            this.b = str;
            return this;
        }

        public final void q(@Nullable String str) {
            this.b = str;
        }

        @NotNull
        public final b r(@Nullable String str) {
            this.d = str;
            return this;
        }

        public final void s(@Nullable String str) {
            this.d = str;
        }

        @NotNull
        public final b t(@Nullable e eVar) {
            this.h = eVar;
            return this;
        }

        public final void u(@Nullable e eVar) {
            this.h = eVar;
        }

        @NotNull
        public final b v(@Nullable String str) {
            this.a = str;
            return this;
        }

        public final void w(@Nullable String str) {
            this.a = str;
        }

        @NotNull
        public final b x(@Nullable String str) {
            this.g = str;
            return this;
        }

        public final void y(@Nullable String str) {
            this.g = str;
        }

        @NotNull
        public final b z(@Nullable List<String> list) {
            this.c = list;
            return this;
        }
    }

    /* renamed from: o.wC0$c */
    /* loaded from: classes2.dex */
    public static final class c implements Parcelable.Creator<C10408wC0> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C10408wC0 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C10408wC0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C10408wC0[] newArray(int i) {
            return new C10408wC0[i];
        }
    }

    /* renamed from: o.wC0$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C9516sY c9516sY) {
            this();
        }

        public d() {
        }
    }

    /* renamed from: o.wC0$e */
    /* loaded from: classes2.dex */
    public enum e {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] valuesCustom = values();
            return (e[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ C10408wC0(b bVar, C9516sY c9516sY) {
        this(bVar);
    }

    @Nullable
    public final a a() {
        return this.a1;
    }

    @Nullable
    public final String b() {
        return this.Y;
    }

    @Nullable
    public final String c() {
        return this.Z0;
    }

    @Nullable
    public final e d() {
        return this.c1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.X;
    }

    @Nullable
    public final String f() {
        return this.b1;
    }

    @Nullable
    public final List<String> g() {
        return this.Z;
    }

    @Nullable
    public final List<String> h() {
        return this.d1;
    }

    @Nullable
    public final String k() {
        return this.Y0;
    }

    @InterfaceC9150r20(message = "Replaced by [getRecipients()]", replaceWith = @IR1(expression = "getRecipients", imports = {}))
    @Nullable
    public final String m() {
        List<String> list = this.Z;
        if (list != null) {
            return TextUtils.join(",", list);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeStringList(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeString(this.Z0);
        parcel.writeSerializable(this.a1);
        parcel.writeString(this.b1);
        parcel.writeSerializable(this.c1);
        parcel.writeStringList(this.d1);
    }

    public C10408wC0(b bVar) {
        this.X = bVar.g();
        this.Y = bVar.d();
        this.Z = bVar.i();
        this.Y0 = bVar.k();
        this.Z0 = bVar.e();
        this.a1 = bVar.c();
        this.b1 = bVar.h();
        this.c1 = bVar.f();
        this.d1 = bVar.j();
    }

    public C10408wC0(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.createStringArrayList();
        this.Y0 = parcel.readString();
        this.Z0 = parcel.readString();
        this.a1 = (a) parcel.readSerializable();
        this.b1 = parcel.readString();
        this.c1 = (e) parcel.readSerializable();
        this.d1 = parcel.createStringArrayList();
    }
}
