package example.core;

public interface CommandHandler<I extends Command, O extends CommandResult> {

    O handle(I command);
}
