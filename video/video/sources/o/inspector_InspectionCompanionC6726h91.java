package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import com.google.android.material.button.MaterialButton;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.X})
@ES1(29)
/* renamed from: o.h91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class inspector.InspectionCompanionC6726h91 implements InspectionCompanion {
    public boolean a = false;
    public int b;

    /* renamed from: a */
    public void readProperties(@InterfaceC5670cr1 MaterialButton materialButton, @InterfaceC5670cr1 PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readInt(this.b, materialButton.getIconPadding());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(@InterfaceC5670cr1 PropertyMapper propertyMapper) {
        int mapInt;
        mapInt = propertyMapper.mapInt("iconPadding", C7025iN1.c.iconPadding);
        this.b = mapInt;
        this.a = true;
    }
}
