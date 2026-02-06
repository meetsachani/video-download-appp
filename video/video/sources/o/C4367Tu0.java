package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.nio.BufferUnderflowException;

/* renamed from: o.Tu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4367Tu0 {
    public static final String a = "FlashAvailability";

    public static boolean a(InterfaceC7884lw interfaceC7884lw) {
        return b(false, interfaceC7884lw);
    }

    public static boolean b(boolean z, InterfaceC7884lw interfaceC7884lw) {
        Boolean bool;
        try {
            bool = (Boolean) interfaceC7884lw.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (X20.a(C4270Su0.class) != null) {
                C7433k41.a(a, String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                C7433k41.d(a, String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
            }
            if (!z) {
                bool = Boolean.FALSE;
            } else {
                throw e;
            }
        }
        if (bool == null) {
            C7433k41.p(a, "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
