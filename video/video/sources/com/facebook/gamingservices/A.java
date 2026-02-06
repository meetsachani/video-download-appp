package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import o.A12;
import o.C6562gT0;
import o.C7538kV;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC7058iW0;
import o.J32;
import o.K32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class A implements J32 {
    @NotNull
    public static final b CREATOR = new b(null);
    @A12("id")
    @InterfaceC7058iW0
    @NotNull
    public final String X;
    @A12(C9998uW1.u0)
    @InterfaceC7058iW0
    @Nullable
    public final String Y;
    @A12("tournament_end_time")
    @InterfaceC7058iW0
    @Nullable
    public String Y0;
    @A12(C9998uW1.v0)
    @InterfaceC7058iW0
    @Nullable
    public final String Z;

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<A> {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public A createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new A(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public A[] newArray(int i) {
            return new A[i];
        }

        public b() {
        }
    }

    public A(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        C6562gT0.p(str, "identifier");
        this.X = str;
        this.Y0 = str2;
        this.Y = str3;
        this.Z = str4;
        b(str2 == null ? null : C7538kV.a.a(str2));
    }

    @Nullable
    public final ZonedDateTime a() {
        String str = this.Y0;
        if (str == null) {
            return null;
        }
        return C7538kV.a.a(str);
    }

    public final void b(ZonedDateTime zonedDateTime) {
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26 && zonedDateTime != null) {
            dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
            format = zonedDateTime.format(dateTimeFormatter);
            this.Y0 = format;
            b(zonedDateTime);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        parcel.writeString(this.X);
        parcel.writeString(this.Y0);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
    }

    /* loaded from: classes2.dex */
    public static final class a implements K32<A, a> {
        @NotNull
        public String a;
        @Nullable
        public ZonedDateTime b;
        @Nullable
        public String c;
        @Nullable
        public String d;
        @Nullable
        public String e;

        public a(@NotNull String str, @Nullable ZonedDateTime zonedDateTime, @Nullable String str2, @Nullable String str3) {
            C6562gT0.p(str, "identifier");
            this.a = str;
            this.b = zonedDateTime;
            this.c = str2;
            this.d = str3;
        }

        public static /* synthetic */ a h(a aVar, String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                zonedDateTime = aVar.b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.c;
            }
            if ((i & 8) != 0) {
                str3 = aVar.d;
            }
            return aVar.g(str, zonedDateTime, str2, str3);
        }

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: b */
        public A build() {
            return new A(this.a, this.e, this.c, this.d);
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        @Nullable
        public final ZonedDateTime d() {
            return this.b;
        }

        @Nullable
        public final String e() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C6562gT0.g(this.a, aVar.a) && C6562gT0.g(this.b, aVar.b) && C6562gT0.g(this.c, aVar.c) && C6562gT0.g(this.d, aVar.d);
            }
            return false;
        }

        @Nullable
        public final String f() {
            return this.d;
        }

        @NotNull
        public final a g(@NotNull String str, @Nullable ZonedDateTime zonedDateTime, @Nullable String str2, @Nullable String str3) {
            C6562gT0.p(str, "identifier");
            return new a(str, zonedDateTime, str2, str3);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ZonedDateTime zonedDateTime = this.b;
            int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final a i(@Nullable ZonedDateTime zonedDateTime) {
            DateTimeFormatter dateTimeFormatter;
            String format;
            s(zonedDateTime);
            if (Build.VERSION.SDK_INT >= 26 && zonedDateTime != null) {
                dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
                format = zonedDateTime.format(dateTimeFormatter);
                r(format);
            }
            return this;
        }

        @Nullable
        public final String j() {
            return this.e;
        }

        @Nullable
        public final ZonedDateTime k() {
            return this.b;
        }

        @NotNull
        public final String l() {
            return this.a;
        }

        @Nullable
        public final String m() {
            return this.d;
        }

        @Nullable
        public final String n() {
            return this.c;
        }

        @NotNull
        public final a o(@NotNull String str) {
            C6562gT0.p(str, "identifier");
            t(str);
            return this;
        }

        @NotNull
        public final a p(@Nullable String str) {
            u(str);
            return this;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: q */
        public a a(@Nullable A a) {
            a p;
            if (a == null) {
                p = null;
            } else {
                p = o(a.X).i(a.a()).w(a.Y).p(a.Z);
            }
            if (p == null) {
                return this;
            }
            return p;
        }

        public final void r(@Nullable String str) {
            this.e = str;
        }

        public final void s(@Nullable ZonedDateTime zonedDateTime) {
            this.b = zonedDateTime;
        }

        public final void t(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.a = str;
        }

        @NotNull
        public String toString() {
            return "Builder(identifier=" + this.a + ", expiration=" + this.b + ", title=" + ((Object) this.c) + ", payload=" + ((Object) this.d) + ')';
        }

        public final void u(@Nullable String str) {
            this.d = str;
        }

        public final void v(@Nullable String str) {
            this.c = str;
        }

        @NotNull
        public final a w(@Nullable String str) {
            v(str);
            return this;
        }

        public /* synthetic */ a(String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, C9516sY c9516sY) {
            this(str, (i & 2) != 0 ? null : zonedDateTime, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(@NotNull Parcel parcel) {
        this(parcel.toString(), parcel.toString(), parcel.toString(), parcel.toString());
        C6562gT0.p(parcel, "parcel");
    }
}
