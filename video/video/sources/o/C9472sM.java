package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.sM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9472sM implements J32 {
    @NotNull
    public static final b CREATOR = new b(null);
    @Nullable
    public final List<String> X;
    @Nullable
    public final Integer Y;
    @Nullable
    public final Integer Z;

    /* renamed from: o.sM$a */
    /* loaded from: classes2.dex */
    public static final class a implements K32<C9472sM, a> {
        @Nullable
        public List<String> a;
        @Nullable
        public Integer b;
        @Nullable
        public Integer c;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public C9472sM build() {
            return new C9472sM(this, null);
        }

        @Nullable
        public final List<String> c() {
            return this.a;
        }

        @Nullable
        public final Integer d() {
            return this.b;
        }

        @Nullable
        public final Integer e() {
            return this.c;
        }

        @NotNull
        public final a f(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((C9472sM) parcel.readParcelable(C9472sM.class.getClassLoader()));
        }

        @Override // o.K32
        @NotNull
        /* renamed from: g */
        public a a(@Nullable C9472sM c9472sM) {
            a l;
            if (c9472sM == null || (l = h(c9472sM.a()).j(c9472sM.b()).l(c9472sM.c())) == null) {
                return this;
            }
            return l;
        }

        @NotNull
        public final a h(@Nullable List<String> list) {
            this.a = list;
            return this;
        }

        public final void i(@Nullable List<String> list) {
            this.a = list;
        }

        @NotNull
        public final a j(@Nullable Integer num) {
            this.b = num;
            return this;
        }

        public final void k(@Nullable Integer num) {
            this.b = num;
        }

        @NotNull
        public final a l(@Nullable Integer num) {
            this.c = num;
            return this;
        }

        public final void m(@Nullable Integer num) {
            this.c = num;
        }
    }

    /* renamed from: o.sM$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<C9472sM> {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C9472sM createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C9472sM(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C9472sM[] newArray(int i) {
            return new C9472sM[i];
        }

        public b() {
        }
    }

    public /* synthetic */ C9472sM(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Nullable
    public final List<String> a() {
        List<String> list = this.X;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @Nullable
    public final Integer b() {
        return this.Y;
    }

    @Nullable
    public final Integer c() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int intValue;
        C6562gT0.p(parcel, "out");
        parcel.writeStringList(this.X);
        Integer num = this.Y;
        int i2 = 0;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        Integer num2 = this.Z;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        parcel.writeInt(i2);
    }

    public C9472sM(a aVar) {
        this.X = aVar.c();
        this.Y = aVar.d();
        this.Z = aVar.e();
    }

    public C9472sM(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.createStringArrayList();
        this.Y = Integer.valueOf(parcel.readInt());
        this.Z = Integer.valueOf(parcel.readInt());
    }
}
