package o;

import android.os.Parcel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class H32 implements J32 {
    @Nullable
    public final String X;

    /* loaded from: classes2.dex */
    public static abstract class a<M extends H32, B extends a<M, B>> implements K32<M, B> {
        @Nullable
        public String a;

        @Nullable
        public final String b() {
            return this.a;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: c */
        public B a(@Nullable M m) {
            if (m == null) {
                return this;
            }
            return d(m.a());
        }

        @NotNull
        public final B d(@Nullable String str) {
            this.a = str;
            return this;
        }

        public final void e(@Nullable String str) {
            this.a = str;
        }
    }

    public H32(@NotNull a<?, ?> aVar) {
        C6562gT0.p(aVar, "builder");
        this.X = aVar.b();
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
        C6562gT0.p(parcel, "dest");
        parcel.writeString(this.X);
    }

    public H32(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        this.X = parcel.readString();
    }
}
