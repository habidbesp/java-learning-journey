package snack_machine_files.service;

import snack_machine_files.domain.Snack;
import java.util.List;

public interface IServiceSnacks {
    void addSnack(Snack snack);
    void showSnacks();
    List<Snack> getSnacks();
}
