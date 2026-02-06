package com.facebook.ads.internal.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Keep;
import com.facebook.proguard.annotations.DoNotStripAny;
import o.InterfaceC11300zs1;
import o.InterfaceC6184ey2;

@InterfaceC6184ey2
@Keep
@DoNotStripAny
/* loaded from: classes2.dex */
public interface AudienceNetworkRemoteServiceApi {

    @Keep
    @DoNotStripAny
    /* loaded from: classes2.dex */
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    @Keep
    @DoNotStripAny
    /* loaded from: classes2.dex */
    public interface PackageVerifier {
        @InterfaceC11300zs1
        String verifyPackage(Context context, Message message, @InterfaceC11300zs1 String str);
    }

    @InterfaceC11300zs1
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(MessageHandler messageHandler);

    void setPackageVerifier(PackageVerifier packageVerifier);
}
