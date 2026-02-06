package o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.F32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class L32 extends F32<L32, a> {
    @Nullable
    public final Bitmap Y;
    public final boolean Y0;
    @Nullable
    public final Uri Z;
    @Nullable
    public final String Z0;
    @NotNull
    public final F32.b a1;
    @NotNull
    public static final c b1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<L32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends F32.a<L32, a> {
        @NotNull
        public static final C0202a g = new C0202a(null);
        @Nullable
        public Bitmap c;
        @Nullable
        public Uri d;
        public boolean e;
        @Nullable
        public String f;

        /* renamed from: o.L32$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0202a {
            public /* synthetic */ C0202a(C9516sY c9516sY) {
                this();
            }

            @NotNull
            public final List<L32> a(@NotNull Parcel parcel) {
                C6562gT0.p(parcel, "parcel");
                ArrayList arrayList = new ArrayList();
                for (Object obj : F32.a.b.a(parcel)) {
                    if (obj instanceof L32) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public final void b(@NotNull Parcel parcel, int i, @NotNull List<L32> list) {
                C6562gT0.p(parcel, "out");
                C6562gT0.p(list, com.facebook.share.c.f);
                Object[] array = list.toArray(new L32[0]);
                if (array != null) {
                    parcel.writeParcelableArray((L32[]) array, i);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }

            public C0202a() {
            }
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: i */
        public L32 build() {
            return new L32(this, null);
        }

        @Nullable
        public final Bitmap j() {
            return this.c;
        }

        @Nullable
        public final String k() {
            return this.f;
        }

        @Nullable
        public final Uri l() {
            return this.d;
        }

        public final boolean m() {
            return this.e;
        }

        @Override // o.F32.a
        @NotNull
        /* renamed from: n */
        public a c(@Nullable L32 l32) {
            if (l32 == null) {
                return this;
            }
            return ((a) super.a(l32)).p(l32.d()).r(l32.f()).s(l32.g()).q(l32.e());
        }

        @NotNull
        public final a o(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return c((L32) parcel.readParcelable(L32.class.getClassLoader()));
        }

        @NotNull
        public final a p(@Nullable Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        @NotNull
        public final a q(@Nullable String str) {
            this.f = str;
            return this;
        }

        @NotNull
        public final a r(@Nullable Uri uri) {
            this.d = uri;
            return this;
        }

        @NotNull
        public final a s(boolean z) {
            this.e = z;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<L32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public L32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new L32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public L32[] newArray(int i) {
            return new L32[i];
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

    public /* synthetic */ L32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.F32
    @NotNull
    public F32.b b() {
        return this.a1;
    }

    @Nullable
    public final Bitmap d() {
        return this.Y;
    }

    @Override // o.F32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.Z0;
    }

    @Nullable
    public final Uri f() {
        return this.Z;
    }

    public final boolean g() {
        return this.Y0;
    }

    @Override // o.F32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Y, 0);
        parcel.writeParcelable(this.Z, 0);
        parcel.writeByte(this.Y0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Z0);
    }

    public L32(a aVar) {
        super(aVar);
        this.a1 = F32.b.PHOTO;
        this.Y = aVar.j();
        this.Z = aVar.l();
        this.Y0 = aVar.m();
        this.Z0 = aVar.k();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.a1 = F32.b.PHOTO;
        this.Y = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.Z = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.Y0 = parcel.readByte() != 0;
        this.Z0 = parcel.readString();
    }
}
