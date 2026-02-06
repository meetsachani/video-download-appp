package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zzb();
    public static final int Y0 = 1;
    public static final int Z = 0;
    public static final int Z0 = 2;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 1)
    public final Intent X;
    public Map Y;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@SafeParcelable.Param(id = 1) @InterfaceC5670cr1 Intent intent) {
        this.X = intent;
    }

    public static int M1(@InterfaceC11300zs1 String str) {
        if (zza.a(str, "high")) {
            return 1;
        }
        if (zza.a(str, "normal")) {
            return 2;
        }
        return 0;
    }

    @InterfaceC5670cr1
    public synchronized Map<String, String> B0() {
        try {
            if (this.Y == null) {
                Bundle extras = this.X.getExtras();
                C2531Be c2531Be = new C2531Be();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith(Constants.MessagePayloadKeys.a) && !str.equals("from") && !str.equals(Constants.MessagePayloadKeys.d) && !str.equals(Constants.MessagePayloadKeys.e)) {
                                c2531Be.put(str, str2);
                            }
                        }
                    }
                }
                this.Y = c2531Be;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.Y;
    }

    @InterfaceC11300zs1
    public String E0() {
        return this.X.getStringExtra("from");
    }

    @InterfaceC5670cr1
    public Intent G0() {
        return this.X;
    }

    @InterfaceC11300zs1
    public String H0() {
        String stringExtra = this.X.getStringExtra(Constants.MessagePayloadKeys.h);
        if (stringExtra == null) {
            return this.X.getStringExtra(Constants.MessagePayloadKeys.f);
        }
        return stringExtra;
    }

    @InterfaceC11300zs1
    public String I0() {
        return this.X.getStringExtra(Constants.MessagePayloadKeys.d);
    }

    @InterfaceC11300zs1
    public final Integer I1() {
        if (this.X.hasExtra(Constants.MessagePayloadKeys.f369o)) {
            return Integer.valueOf(this.X.getIntExtra(Constants.MessagePayloadKeys.f369o, 0));
        }
        return null;
    }

    public int O0() {
        String stringExtra = this.X.getStringExtra(Constants.MessagePayloadKeys.k);
        if (stringExtra == null) {
            stringExtra = this.X.getStringExtra(Constants.MessagePayloadKeys.m);
        }
        return M1(stringExtra);
    }

    public int S0() {
        String stringExtra = this.X.getStringExtra(Constants.MessagePayloadKeys.l);
        if (stringExtra == null) {
            if (zza.a(this.X.getStringExtra(Constants.MessagePayloadKeys.n), "1")) {
                return 2;
            }
            stringExtra = this.X.getStringExtra(Constants.MessagePayloadKeys.m);
        }
        return M1(stringExtra);
    }

    @InterfaceC11300zs1
    public byte[] U0() {
        return this.X.getByteArrayExtra("rawData");
    }

    @InterfaceC11300zs1
    public String V0() {
        return this.X.getStringExtra(Constants.MessagePayloadKeys.q);
    }

    public long Z0() {
        Object obj;
        Bundle extras = this.X.getExtras();
        if (extras != null) {
            obj = extras.get(Constants.MessagePayloadKeys.j);
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("CloudMessage", "Invalid sent time: ".concat(String.valueOf(obj)));
                return 0L;
            }
        }
        return 0L;
    }

    @InterfaceC11300zs1
    public String e1() {
        return this.X.getStringExtra(Constants.MessagePayloadKeys.g);
    }

    @InterfaceC11300zs1
    public String m0() {
        return this.X.getStringExtra(Constants.MessagePayloadKeys.e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.S(parcel, 1, this.X, i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public int x1() {
        Object obj;
        Bundle extras = this.X.getExtras();
        if (extras != null) {
            obj = extras.get(Constants.MessagePayloadKeys.i);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("CloudMessage", "Invalid TTL: ".concat(String.valueOf(obj)));
                return 0;
            }
        }
        return 0;
    }
}
