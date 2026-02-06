package pub.devrel.easypermissions;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.a;
import o.ActivityC3020Gb;
import o.C2625Cd;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes4.dex */
public class AppSettingsDialogHolderActivity extends ActivityC3020Gb implements DialogInterface.OnClickListener {
    public static final int E1 = 7534;
    public a C1;
    public int D1;

    public static Intent F1(Context context, C2625Cd c2625Cd) {
        Intent intent = new Intent(context, AppSettingsDialogHolderActivity.class);
        intent.putExtra(C2625Cd.g1, c2625Cd);
        return intent;
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.D1);
            startActivityForResult(data, E1);
        } else if (i == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException("Unknown button type: " + i);
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2625Cd a = C2625Cd.a(getIntent(), this);
        this.D1 = a.b();
        this.C1 = a.e(this, this);
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a aVar = this.C1;
        if (aVar != null && aVar.isShowing()) {
            this.C1.dismiss();
        }
    }
}
