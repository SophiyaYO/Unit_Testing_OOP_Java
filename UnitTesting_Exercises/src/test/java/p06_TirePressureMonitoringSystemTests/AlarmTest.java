package p06_TirePressureMonitoringSystemTests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import p06_TirePressureMonitoringSystem.Alarm;
import p06_TirePressureMonitoringSystem.Sensor;

public class AlarmTest {

    @Test
    public void alarmShouldBeOnIfOutOfScope() {
        Alarm alarm = new Alarm();
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(16d);
        alarm.setSensor(sensor);
        alarm.check();

        Assert.assertTrue(alarm.getAlarmOn());
    }

}
