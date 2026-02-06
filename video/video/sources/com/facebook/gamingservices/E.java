package com.facebook.gamingservices;

import android.media.Image;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import o.C6562gT0;
import o.C7538kV;
import o.C9516sY;
import o.C9998uW1;
import o.EnumC5186ar2;
import o.EnumC6156er2;
import o.J32;
import o.K32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class E implements J32 {
    @NotNull
    public static final b CREATOR = new b(null);
    @Nullable
    public final String X;
    @Nullable
    public final EnumC6156er2 Y;
    @Nullable
    public final Instant Y0;
    @Nullable
    public final EnumC5186ar2 Z;
    @Nullable
    public final Image Z0;
    @Nullable
    public final String a1;

    /* loaded from: classes2.dex */
    public static final class a implements K32<E, a> {
        @Nullable
        public String a;
        @Nullable
        public EnumC6156er2 b;
        @Nullable
        public EnumC5186ar2 c;
        @Nullable
        public Instant d;
        @Nullable
        public Image e;
        @Nullable
        public String f;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public E build() {
            return new E(this, null);
        }

        @Nullable
        public final Instant c() {
            return this.d;
        }

        @Nullable
        public final Image d() {
            return this.e;
        }

        @Nullable
        public final String e() {
            return this.f;
        }

        @Nullable
        public final EnumC5186ar2 f() {
            return this.c;
        }

        @Nullable
        public final EnumC6156er2 g() {
            return this.b;
        }

        @Nullable
        public final String h() {
            return this.a;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: i */
        public a a(@Nullable E e) {
            if (e == null) {
                return this;
            }
            EnumC6156er2 e2 = e.e();
            if (e2 != null) {
                u(e2);
            }
            EnumC5186ar2 d = e.d();
            if (d != null) {
                t(d);
            }
            Instant a = e.a();
            if (a != null) {
                q(a);
            }
            String f = e.f();
            if (f != null) {
                v(f);
            }
            s(e.c());
            return this;
        }

        @NotNull
        public final a j(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return a((E) parcel.readParcelable(E.class.getClassLoader()));
        }

        public final void k(@Nullable Instant instant) {
            this.d = instant;
        }

        public final void l(@Nullable Image image) {
            this.e = image;
        }

        public final void m(@Nullable String str) {
            this.f = str;
        }

        public final void n(@Nullable EnumC5186ar2 enumC5186ar2) {
            this.c = enumC5186ar2;
        }

        public final void o(@Nullable EnumC6156er2 enumC6156er2) {
            this.b = enumC6156er2;
        }

        public final void p(@Nullable String str) {
            this.a = str;
        }

        @NotNull
        public final a q(@NotNull Instant instant) {
            C6562gT0.p(instant, C9998uW1.Q);
            this.d = instant;
            return this;
        }

        @NotNull
        public final a r(@Nullable Image image) {
            this.e = image;
            return this;
        }

        @NotNull
        public final a s(@Nullable String str) {
            this.f = str;
            return this;
        }

        @NotNull
        public final a t(@NotNull EnumC5186ar2 enumC5186ar2) {
            C6562gT0.p(enumC5186ar2, "scoreType");
            this.c = enumC5186ar2;
            return this;
        }

        @NotNull
        public final a u(@NotNull EnumC6156er2 enumC6156er2) {
            C6562gT0.p(enumC6156er2, C9998uW1.N);
            this.b = enumC6156er2;
            return this;
        }

        @NotNull
        public final a v(@Nullable String str) {
            this.a = str;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<E> {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public E createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new E(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public E[] newArray(int i) {
            return new E[i];
        }

        public b() {
        }
    }

    public /* synthetic */ E(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Nullable
    public final Instant a() {
        return this.Y0;
    }

    @Nullable
    public final Image b() {
        return this.Z0;
    }

    @Nullable
    public final String c() {
        return this.a1;
    }

    @Nullable
    public final EnumC5186ar2 d() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final EnumC6156er2 e() {
        return this.Y;
    }

    @Nullable
    public final String f() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        parcel.writeString(String.valueOf(this.Y));
        parcel.writeString(String.valueOf(this.Z));
        parcel.writeString(String.valueOf(this.Y0));
        parcel.writeString(this.X);
        parcel.writeString(this.a1);
    }

    public E(a aVar) {
        this.X = aVar.h();
        this.Y = aVar.g();
        this.Z = aVar.f();
        this.Y0 = aVar.c();
        this.Z0 = aVar.d();
        this.a1 = aVar.e();
    }

    public E(@NotNull Parcel parcel) {
        EnumC6156er2 enumC6156er2;
        EnumC5186ar2 enumC5186ar2;
        Instant a2;
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readString();
        EnumC6156er2[] valuesCustom = EnumC6156er2.valuesCustom();
        int length = valuesCustom.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                enumC6156er2 = null;
                break;
            }
            enumC6156er2 = valuesCustom[i2];
            if (C6562gT0.g(enumC6156er2.name(), parcel.readString())) {
                break;
            }
            i2++;
        }
        this.Y = enumC6156er2;
        EnumC5186ar2[] valuesCustom2 = EnumC5186ar2.valuesCustom();
        int length2 = valuesCustom2.length;
        while (true) {
            if (i >= length2) {
                enumC5186ar2 = null;
                break;
            }
            enumC5186ar2 = valuesCustom2[i];
            if (C6562gT0.g(enumC5186ar2.name(), parcel.readString())) {
                break;
            }
            i++;
        }
        this.Z = enumC5186ar2;
        if (Build.VERSION.SDK_INT >= 26) {
            String readString = parcel.readString();
            a2 = readString == null ? null : Instant.from(B.a(C7538kV.a.a(readString)));
        } else {
            a2 = D.a(null);
        }
        this.Y0 = a2;
        this.a1 = parcel.readString();
        this.Z0 = null;
    }
}
