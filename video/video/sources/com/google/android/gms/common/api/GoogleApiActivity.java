package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.UE;

@KeepName
/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    @VisibleForTesting
    public int X = 0;

    @InterfaceC5670cr1
    public static Intent a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra(CloudMessagingReceiver.IntentKeys.a, pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    public final void b() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(CloudMessagingReceiver.IntentKeys.a);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e) {
                e = e;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.X = 1;
            } catch (ActivityNotFoundException e3) {
                e = e3;
                if (extras.getBoolean("notify_manager", true)) {
                    GoogleApiManager.z(this).M(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(obj);
                    sb.append(UE.h);
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb2, e);
                }
                googleApiActivity.X = 1;
                finish();
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } else {
            GoogleApiAvailability.x().B(this, ((Integer) Preconditions.r(num)).intValue(), 2, this);
            this.X = 1;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, @InterfaceC5670cr1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.X = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                GoogleApiManager z = GoogleApiManager.z(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        z.M(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    z.b();
                }
            }
        } else if (i == 2) {
            this.X = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@InterfaceC5670cr1 DialogInterface dialogInterface) {
        this.X = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(@InterfaceC11300zs1 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.X = bundle.getInt("resolution");
        }
        if (this.X != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@InterfaceC5670cr1 Bundle bundle) {
        bundle.putInt("resolution", this.X);
        super.onSaveInstanceState(bundle);
    }
}
