package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C3016Ga;

/* renamed from: o.Iv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3295Iv extends CameraCaptureSession.CaptureCallback {
    public a b = null;
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> a = new HashMap();

    /* renamed from: o.Iv$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    public void a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.a.put(captureRequest, arrayList);
            return;
        }
        this.a.put(captureRequest, list);
    }

    public final List<CameraCaptureSession.CaptureCallback> b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.a.get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    public void c(a aVar) {
        this.b = aVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            C3016Ga.c.a(captureCallback, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
