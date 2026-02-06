package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.F32;
import o.F32.a;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public abstract class F32<M extends F32<M, B>, B extends a<M, B>> implements J32 {
    @NotNull
    public final Bundle X;

    /* loaded from: classes2.dex */
    public static abstract class a<M extends F32<M, B>, B extends a<M, B>> implements K32<M, B> {
        @NotNull
        public static final C0183a b = new C0183a(null);
        @NotNull
        public Bundle a = new Bundle();

        /* renamed from: o.F32$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0183a {
            public /* synthetic */ C0183a(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            @NotNull
            public final List<F32<?, ?>> a(@NotNull Parcel parcel) {
                C6562gT0.p(parcel, "parcel");
                Parcelable[] readParcelableArray = parcel.readParcelableArray(F32.class.getClassLoader());
                if (readParcelableArray == null) {
                    return C8222nF.H();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof F32) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            @InterfaceC9511sW0
            public final void b(@NotNull Parcel parcel, int i, @NotNull List<? extends F32<?, ?>> list) {
                C6562gT0.p(parcel, "out");
                C6562gT0.p(list, "media");
                Object[] array = list.toArray(new F32[0]);
                if (array != null) {
                    parcel.writeParcelableArray((Parcelable[]) array, i);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }

            public C0183a() {
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public static final List<F32<?, ?>> d(@NotNull Parcel parcel) {
            return b.a(parcel);
        }

        @InterfaceC9511sW0
        public static final void h(@NotNull Parcel parcel, int i, @NotNull List<? extends F32<?, ?>> list) {
            b.b(parcel, i, list);
        }

        @NotNull
        public final Bundle b() {
            return this.a;
        }

        @Override // o.K32
        @NotNull
        /* renamed from: c */
        public B a(@Nullable M m) {
            if (m == null) {
                return this;
            }
            return f(m.X);
        }

        @InterfaceC9150r20(message = "This method is deprecated. Use GraphRequest directly to set parameters.")
        @NotNull
        public final B e(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "key");
            C6562gT0.p(str2, "value");
            this.a.putString(str, str2);
            return this;
        }

        @InterfaceC9150r20(message = "This method is deprecated. Use GraphRequest directly to set parameters.")
        @NotNull
        public final B f(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, BreadcrumbAnalyticsEventReceiver.c);
            this.a.putAll(bundle);
            return this;
        }

        public final void g(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "<set-?>");
            this.a = bundle;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        PHOTO,
        VIDEO;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public F32(@NotNull a<M, B> aVar) {
        C6562gT0.p(aVar, "builder");
        this.X = new Bundle(aVar.b());
    }

    @NotNull
    public abstract b b();

    @InterfaceC9150r20(message = "This method is deprecated. Use GraphRequest directly to set parameters.")
    @NotNull
    public final Bundle c() {
        return new Bundle(this.X);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeBundle(this.X);
    }

    public F32(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.X = readBundle == null ? new Bundle() : readBundle;
    }
}
