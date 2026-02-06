package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.rS0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9254rS0 implements Parcelable {
    public final IntentSender X;
    public final Intent Y;
    public final int Y0;
    public final int Z;
    public static final c Z0 = new c(null);
    public static final Parcelable.Creator<C9254rS0> CREATOR = new b();

    /* renamed from: o.rS0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final IntentSender a;
        public Intent b;
        public int c;
        public int d;

        @Retention(RetentionPolicy.SOURCE)
        @InterfaceC7780lU1(EnumC7796la.X)
        /* renamed from: o.rS0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0336a {
        }

        public a(IntentSender intentSender) {
            C6562gT0.p(intentSender, "intentSender");
            this.a = intentSender;
        }

        public final C9254rS0 a() {
            return new C9254rS0(this.a, this.b, this.c, this.d);
        }

        public final a b(Intent intent) {
            this.b = intent;
            return this;
        }

        public final a c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(PendingIntent pendingIntent) {
            this(r2);
            C6562gT0.p(pendingIntent, BaseGmsClient.B1);
            IntentSender intentSender = pendingIntent.getIntentSender();
            C6562gT0.o(intentSender, "getIntentSender(...)");
        }
    }

    /* renamed from: o.rS0$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<C9254rS0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9254rS0 createFromParcel(Parcel parcel) {
            C6562gT0.p(parcel, "inParcel");
            return new C9254rS0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C9254rS0[] newArray(int i) {
            return new C9254rS0[i];
        }
    }

    /* renamed from: o.rS0$c */
    /* loaded from: classes.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public c() {
        }

        public static /* synthetic */ void a() {
        }
    }

    public C9254rS0(IntentSender intentSender, Intent intent, int i, int i2) {
        C6562gT0.p(intentSender, "intentSender");
        this.X = intentSender;
        this.Y = intent;
        this.Z = i;
        this.Y0 = i2;
    }

    public final Intent a() {
        return this.Y;
    }

    public final int b() {
        return this.Z;
    }

    public final int c() {
        return this.Y0;
    }

    public final IntentSender d() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.Y0);
    }

    public /* synthetic */ C9254rS0(IntentSender intentSender, Intent intent, int i, int i2, int i3, C9516sY c9516sY) {
        this(intentSender, (i3 & 2) != 0 ? null : intent, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9254rS0(Parcel parcel) {
        this((IntentSender) r0, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        C6562gT0.p(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        C6562gT0.m(readParcelable);
    }
}
