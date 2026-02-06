package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.AbstractC9885u32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class E32 extends AbstractC9885u32<E32, a> {
    @Nullable
    public final String b1;
    @NotNull
    public static final c c1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<E32> CREATOR = new b();

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9885u32.a<E32, a> {
        @Nullable
        public String g;

        @Override // com.facebook.share.d
        @NotNull
        /* renamed from: u */
        public E32 build() {
            return new E32(this, null);
        }

        @Nullable
        public final String v() {
            return this.g;
        }

        @Override // o.AbstractC9885u32.a
        @NotNull
        /* renamed from: w */
        public a h(@Nullable E32 e32) {
            if (e32 == null) {
                return this;
            }
            return ((a) super.a(e32)).x(e32.h());
        }

        @NotNull
        public final a x(@Nullable String str) {
            this.g = str;
            return this;
        }

        public final void y(@Nullable String str) {
            this.g = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<E32> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public E32 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new E32(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public E32[] newArray(int i) {
            return new E32[i];
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

    public /* synthetic */ E32(a aVar, C9516sY c9516sY) {
        this(aVar);
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String h() {
        return this.b1;
    }

    @Override // o.AbstractC9885u32, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b1);
    }

    public E32(a aVar) {
        super(aVar);
        this.b1 = aVar.v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E32(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
        this.b1 = parcel.readString();
    }
}
