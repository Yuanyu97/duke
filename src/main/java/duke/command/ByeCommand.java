package duke.command;

import java.io.IOException;

import duke.storage.Storage;

import duke.task.TaskList;

import duke.ui.Ui;
/**
 * Represents the command of exiting the program. A <code>ByeCommand</code> object corresponds to the command of exiting
 * the program.
 */

public class ByeCommand extends Command {
    /**
     * Returns the result of whether this is an exit program command.
     * @return The result of whether this command can exit the program.
     */

    @Override
    public boolean isExit() {
        return true;
    }
    /**
     * Exits the program. If storage file is invalid, an error message is returned.
     * @param tasks The task list to be updated.
     * @param ui The user interface to be to be shown.
     * @param storage The storage file to be updated.
     * @throws IOException If the storage file is not found.
     */

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws IOException {
        ui.showByeMsg();
    }
}
