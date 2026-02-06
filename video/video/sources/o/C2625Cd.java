package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import o.C7509kN1;
import o.HT1;
import pub.devrel.easypermissions.AppSettingsDialogHolderActivity;

/* renamed from: o.Cd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2625Cd implements Parcelable {
    @HT1({HT1.a.Y})
    public static final Parcelable.Creator<C2625Cd> CREATOR = new a();
    public static final String e1 = "EasyPermissions";
    public static final int f1 = 16061;
    public static final String g1 = "extra_app_settings";
    @InterfaceC4698Xf2
    public final int X;
    public final String Y;
    public final String Y0;
    public final String Z;
    public final String Z0;
    public final int a1;
    public final int b1;
    public Object c1;
    public Context d1;

    /* renamed from: o.Cd$a */
    /* loaded from: classes4.dex */
    public static class a implements Parcelable.Creator<C2625Cd> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C2625Cd createFromParcel(Parcel parcel) {
            return new C2625Cd(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C2625Cd[] newArray(int i) {
            return new C2625Cd[i];
        }
    }

    public /* synthetic */ C2625Cd(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static C2625Cd a(Intent intent, Activity activity) {
        C2625Cd c2625Cd = (C2625Cd) intent.getParcelableExtra(g1);
        if (c2625Cd == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            c2625Cd = new b(activity).a();
        }
        c2625Cd.c(activity);
        return c2625Cd;
    }

    public int b() {
        return this.b1;
    }

    public final void c(Object obj) {
        this.c1 = obj;
        if (obj instanceof Activity) {
            this.d1 = (Activity) obj;
        } else if (obj instanceof Fragment) {
            this.d1 = ((Fragment) obj).v();
        } else {
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    public void d() {
        f(AppSettingsDialogHolderActivity.F1(this.d1, this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public androidx.appcompat.app.a e(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        a.C0006a c0006a;
        int i = this.X;
        if (i != -1) {
            c0006a = new a.C0006a(this.d1, i);
        } else {
            c0006a = new a.C0006a(this.d1);
        }
        return c0006a.b(false).setTitle(this.Z).l(this.Y).y(this.Y0, onClickListener).p(this.Z0, onClickListener2).I();
    }

    public final void f(Intent intent) {
        Object obj = this.c1;
        if (obj instanceof Activity) {
            ((Activity) obj).startActivityForResult(intent, this.a1);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).startActivityForResult(intent, this.a1);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeString(this.Z0);
        parcel.writeInt(this.a1);
        parcel.writeInt(this.b1);
    }

    public /* synthetic */ C2625Cd(Object obj, int i, String str, String str2, String str3, String str4, int i2, int i3, a aVar) {
        this(obj, i, str, str2, str3, str4, i2, i3);
    }

    public C2625Cd(Parcel parcel) {
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.Y0 = parcel.readString();
        this.Z0 = parcel.readString();
        this.a1 = parcel.readInt();
        this.b1 = parcel.readInt();
    }

    /* renamed from: o.Cd$b */
    /* loaded from: classes4.dex */
    public static class b {
        public final Object a;
        public final Context b;
        public String d;
        public String e;
        public String f;
        public String g;
        @InterfaceC4698Xf2
        public int c = -1;
        public int h = -1;
        public boolean i = false;

        public b(@InterfaceC5670cr1 Activity activity) {
            this.a = activity;
            this.b = activity;
        }

        @InterfaceC5670cr1
        public C2625Cd a() {
            String str;
            String str2;
            String str3;
            String str4;
            int i;
            if (TextUtils.isEmpty(this.d)) {
                str = this.b.getString(C7509kN1.k.rationale_ask_again);
            } else {
                str = this.d;
            }
            this.d = str;
            if (TextUtils.isEmpty(this.e)) {
                str2 = this.b.getString(C7509kN1.k.title_settings_dialog);
            } else {
                str2 = this.e;
            }
            this.e = str2;
            if (TextUtils.isEmpty(this.f)) {
                str3 = this.b.getString(17039370);
            } else {
                str3 = this.f;
            }
            this.f = str3;
            if (TextUtils.isEmpty(this.g)) {
                str4 = this.b.getString(17039360);
            } else {
                str4 = this.g;
            }
            this.g = str4;
            int i2 = this.h;
            if (i2 <= 0) {
                i2 = C2625Cd.f1;
            }
            this.h = i2;
            if (this.i) {
                i = 268435456;
            } else {
                i = 0;
            }
            return new C2625Cd(this.a, this.c, this.d, this.e, this.f, this.g, this.h, i, null);
        }

        @InterfaceC5670cr1
        public b b(@InterfaceC3329Je2 int i) {
            this.g = this.b.getString(i);
            return this;
        }

        @InterfaceC5670cr1
        public b c(@InterfaceC11300zs1 String str) {
            this.g = str;
            return this;
        }

        @InterfaceC5670cr1
        public b d(boolean z) {
            this.i = z;
            return this;
        }

        @InterfaceC5670cr1
        public b e(@InterfaceC3329Je2 int i) {
            this.f = this.b.getString(i);
            return this;
        }

        @InterfaceC5670cr1
        public b f(@InterfaceC11300zs1 String str) {
            this.f = str;
            return this;
        }

        @InterfaceC5670cr1
        public b g(@InterfaceC3329Je2 int i) {
            this.d = this.b.getString(i);
            return this;
        }

        @InterfaceC5670cr1
        public b h(@InterfaceC11300zs1 String str) {
            this.d = str;
            return this;
        }

        @InterfaceC5670cr1
        public b i(int i) {
            this.h = i;
            return this;
        }

        @InterfaceC5670cr1
        public b j(@InterfaceC4698Xf2 int i) {
            this.c = i;
            return this;
        }

        @InterfaceC5670cr1
        public b k(@InterfaceC3329Je2 int i) {
            this.e = this.b.getString(i);
            return this;
        }

        @InterfaceC5670cr1
        public b l(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        public b(@InterfaceC5670cr1 Fragment fragment) {
            this.a = fragment;
            this.b = fragment.v();
        }
    }

    public C2625Cd(@InterfaceC5670cr1 Object obj, @InterfaceC4698Xf2 int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, int i2, int i3) {
        c(obj);
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.Y0 = str3;
        this.Z0 = str4;
        this.a1 = i2;
        this.b1 = i3;
    }
}
