package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import o.BR0;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    public static final int Y0 = 0;
    public static final int Z0 = 1;
    public static final int a1 = 2;
    @SafeParcelable.Field(id = 2)
    public Bundle X;
    public Map<String, String> Y;
    public Notification Z;

    /* loaded from: classes3.dex */
    public static class Builder {
        public final Bundle a;
        public final Map<String, String> b;

        public Builder(@InterfaceC5670cr1 String str) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = new C2531Be();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(Constants.MessagePayloadKeys.g, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @InterfaceC5670cr1
        public Builder a(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2) {
            this.b.put(str, str2);
            return this;
        }

        @InterfaceC5670cr1
        public RemoteMessage b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new RemoteMessage(bundle);
        }

        @InterfaceC5670cr1
        public Builder c() {
            this.b.clear();
            return this;
        }

        @InterfaceC11300zs1
        public String d() {
            return this.a.getString(Constants.MessagePayloadKeys.d);
        }

        @InterfaceC5670cr1
        public Map<String, String> e() {
            return this.b;
        }

        @InterfaceC5670cr1
        public String f() {
            return this.a.getString(Constants.MessagePayloadKeys.h, "");
        }

        @InterfaceC11300zs1
        public String g() {
            return this.a.getString(Constants.MessagePayloadKeys.d);
        }

        @BR0(from = 0, to = 86400)
        public int h() {
            return Integer.parseInt(this.a.getString(Constants.MessagePayloadKeys.d, "0"));
        }

        @InterfaceC5670cr1
        public Builder i(@InterfaceC11300zs1 String str) {
            this.a.putString(Constants.MessagePayloadKeys.e, str);
            return this;
        }

        @InterfaceC5670cr1
        public Builder j(@InterfaceC5670cr1 Map<String, String> map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }

        @InterfaceC5670cr1
        public Builder k(@InterfaceC5670cr1 String str) {
            this.a.putString(Constants.MessagePayloadKeys.h, str);
            return this;
        }

        @InterfaceC5670cr1
        public Builder l(@InterfaceC11300zs1 String str) {
            this.a.putString(Constants.MessagePayloadKeys.d, str);
            return this;
        }

        @ShowFirstParty
        @InterfaceC5670cr1
        public Builder m(byte[] bArr) {
            this.a.putByteArray("rawData", bArr);
            return this;
        }

        @InterfaceC5670cr1
        public Builder n(@BR0(from = 0, to = 86400) int i) {
            this.a.putString(Constants.MessagePayloadKeys.i, String.valueOf(i));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MessagePriority {
    }

    /* loaded from: classes3.dex */
    public static class Notification {
        public final String a;
        public final String b;
        public final String[] c;
        public final String d;
        public final String e;
        public final String[] f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final Uri n;

        /* renamed from: o  reason: collision with root package name */
        public final String f380o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final int[] s;
        public final Long t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final long[] z;

        public static String[] p(NotificationParams notificationParams, String str) {
            Object[] g = notificationParams.g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        @InterfaceC11300zs1
        public Integer A() {
            return this.q;
        }

        @InterfaceC11300zs1
        public String a() {
            return this.d;
        }

        @InterfaceC11300zs1
        public String[] b() {
            return this.f;
        }

        @InterfaceC11300zs1
        public String c() {
            return this.e;
        }

        @InterfaceC11300zs1
        public String d() {
            return this.m;
        }

        @InterfaceC11300zs1
        public String e() {
            return this.l;
        }

        @InterfaceC11300zs1
        public String f() {
            return this.k;
        }

        public boolean g() {
            return this.y;
        }

        public boolean h() {
            return this.w;
        }

        public boolean i() {
            return this.x;
        }

        @InterfaceC11300zs1
        public Long j() {
            return this.t;
        }

        @InterfaceC11300zs1
        public String k() {
            return this.g;
        }

        @InterfaceC11300zs1
        public Uri l() {
            String str = this.h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @InterfaceC11300zs1
        public int[] m() {
            return this.s;
        }

        @InterfaceC11300zs1
        public Uri n() {
            return this.n;
        }

        public boolean o() {
            return this.v;
        }

        @InterfaceC11300zs1
        public Integer q() {
            return this.r;
        }

        @InterfaceC11300zs1
        public Integer r() {
            return this.p;
        }

        @InterfaceC11300zs1
        public String s() {
            return this.i;
        }

        public boolean t() {
            return this.u;
        }

        @InterfaceC11300zs1
        public String u() {
            return this.j;
        }

        @InterfaceC11300zs1
        public String v() {
            return this.f380o;
        }

        @InterfaceC11300zs1
        public String w() {
            return this.a;
        }

        @InterfaceC11300zs1
        public String[] x() {
            return this.c;
        }

        @InterfaceC11300zs1
        public String y() {
            return this.b;
        }

        @InterfaceC11300zs1
        public long[] z() {
            return this.z;
        }

        public Notification(NotificationParams notificationParams) {
            this.a = notificationParams.p(Constants.MessageNotificationKeys.g);
            this.b = notificationParams.h(Constants.MessageNotificationKeys.g);
            this.c = p(notificationParams, Constants.MessageNotificationKeys.g);
            this.d = notificationParams.p(Constants.MessageNotificationKeys.h);
            this.e = notificationParams.h(Constants.MessageNotificationKeys.h);
            this.f = p(notificationParams, Constants.MessageNotificationKeys.h);
            this.g = notificationParams.p(Constants.MessageNotificationKeys.i);
            this.i = notificationParams.o();
            this.j = notificationParams.p(Constants.MessageNotificationKeys.k);
            this.k = notificationParams.p(Constants.MessageNotificationKeys.l);
            this.l = notificationParams.p(Constants.MessageNotificationKeys.A);
            this.m = notificationParams.p(Constants.MessageNotificationKeys.D);
            this.n = notificationParams.f();
            this.h = notificationParams.p(Constants.MessageNotificationKeys.j);
            this.f380o = notificationParams.p(Constants.MessageNotificationKeys.m);
            this.p = notificationParams.b(Constants.MessageNotificationKeys.p);
            this.q = notificationParams.b(Constants.MessageNotificationKeys.u);
            this.r = notificationParams.b(Constants.MessageNotificationKeys.t);
            this.u = notificationParams.a(Constants.MessageNotificationKeys.f368o);
            this.v = notificationParams.a(Constants.MessageNotificationKeys.n);
            this.w = notificationParams.a(Constants.MessageNotificationKeys.q);
            this.x = notificationParams.a(Constants.MessageNotificationKeys.r);
            this.y = notificationParams.a(Constants.MessageNotificationKeys.s);
            this.t = notificationParams.j(Constants.MessageNotificationKeys.x);
            this.s = notificationParams.e();
            this.z = notificationParams.q();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.X = bundle;
    }

    @InterfaceC5670cr1
    public Map<String, String> B0() {
        if (this.Y == null) {
            this.Y = Constants.MessagePayloadKeys.a(this.X);
        }
        return this.Y;
    }

    @InterfaceC11300zs1
    public String E0() {
        return this.X.getString("from");
    }

    @InterfaceC11300zs1
    public String G0() {
        String string = this.X.getString(Constants.MessagePayloadKeys.h);
        if (string == null) {
            return this.X.getString(Constants.MessagePayloadKeys.f);
        }
        return string;
    }

    public final int H0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    @InterfaceC11300zs1
    public String I0() {
        return this.X.getString(Constants.MessagePayloadKeys.d);
    }

    public int I1() {
        Object obj = this.X.get(Constants.MessagePayloadKeys.i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    public void M1(Intent intent) {
        intent.putExtras(this.X);
    }

    @InterfaceC11300zs1
    public Notification O0() {
        if (this.Z == null && NotificationParams.v(this.X)) {
            this.Z = new Notification(new NotificationParams(this.X));
        }
        return this.Z;
    }

    public int S0() {
        String string = this.X.getString(Constants.MessagePayloadKeys.k);
        if (string == null) {
            string = this.X.getString(Constants.MessagePayloadKeys.m);
        }
        return H0(string);
    }

    @KeepForSdk
    public Intent T1() {
        Intent intent = new Intent();
        intent.putExtras(this.X);
        return intent;
    }

    public int U0() {
        String string = this.X.getString(Constants.MessagePayloadKeys.l);
        if (string == null) {
            if ("1".equals(this.X.getString(Constants.MessagePayloadKeys.n))) {
                return 2;
            }
            string = this.X.getString(Constants.MessagePayloadKeys.m);
        }
        return H0(string);
    }

    @InterfaceC11300zs1
    @ShowFirstParty
    public byte[] V0() {
        return this.X.getByteArray("rawData");
    }

    @InterfaceC11300zs1
    public String Z0() {
        return this.X.getString(Constants.MessagePayloadKeys.q);
    }

    public long e1() {
        Object obj = this.X.get(Constants.MessagePayloadKeys.j);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
                return 0L;
            }
        }
        return 0L;
    }

    @InterfaceC11300zs1
    public String m0() {
        return this.X.getString(Constants.MessagePayloadKeys.e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        RemoteMessageCreator.c(this, parcel, i);
    }

    @InterfaceC11300zs1
    public String x1() {
        return this.X.getString(Constants.MessagePayloadKeys.g);
    }
}
